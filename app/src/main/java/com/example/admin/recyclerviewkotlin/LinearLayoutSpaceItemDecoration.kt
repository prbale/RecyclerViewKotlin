package com.example.admin.recyclerviewkotlin

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

class LinearLayoutSpaceItemDecoration(private var spacing: Int) :
    RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {

        outRect?.let {
            if (parent != null) {
                val position = parent.getChildAdapterPosition(view)
                it.apply {
                  left = spacing
                  right = spacing
                  bottom = spacing
                  if (position < 1) top = spacing
                }
            }
        }
    }
}
