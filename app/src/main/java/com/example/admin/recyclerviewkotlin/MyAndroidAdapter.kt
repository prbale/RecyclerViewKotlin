package com.example.admin.recyclerviewkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.item_android_version.view.*
import android.support.v4.view.ViewCompat.setAlpha
import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.support.v4.view.ViewCompat.animate
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.TranslateAnimation





class MyAndroidAdapter(private val androidOSList: ArrayList<Employee>, private val listener: (Employee) -> Unit) : RecyclerView.Adapter<MyAndroidAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAndroidAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_android_version, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyAndroidAdapter.ViewHolder, position: Int) {
        holder.bindItems(androidOSList[position], listener)
    }

    override fun getItemCount(): Int = androidOSList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(androidOS: Employee, listener: (Employee) -> Unit) = with(itemView)  {
            this.tvName.text = androidOS.employeeName
            this.tvVersion.text = androidOS.employeeId
            this.ivIcon.setImageResource(R.drawable.employee)

            this.setOnClickListener {
                if(itemView.findViewById<LinearLayout>(R.id.bottomPanel).visibility == View.VISIBLE) {
                    slideToTop(itemView.findViewById<LinearLayout>(R.id.bottomPanel))
                }
                else {
                    slideToBottom(itemView.findViewById<LinearLayout>(R.id.bottomPanel))
                }
                listener(androidOS)
            }
        }

        // Ref: https://colinyeoh.wordpress.com/2012/10/07/simple-android-animation-on-view-gonevisible/

        private fun slideToBottom(view: View) {view.height.toFloat()
            val animate = TranslateAnimation(0f, 0f, (-view.height).toFloat(), 0f)
            animate.duration = 500
            animate.fillAfter = true
            view.startAnimation(animate)
            view.visibility = View.VISIBLE
            animate.setAnimationListener(object : AnimatorListenerAdapter(), AnimationListener {
                override fun onAnimationRepeat(p0: Animation?) {
                }
                override fun onAnimationStart(p0: Animation?) {
                }
                override fun onAnimationEnd(p0: Animation?) {

                }
            })
        }

        private fun slideToTop(view: View) {
            val animate = TranslateAnimation(0f, 0f, 0f, (-view.height).toFloat())
            animate.duration = 500
            animate.fillAfter = true
            view.startAnimation(animate)
            animate.setAnimationListener(object : AnimatorListenerAdapter(), AnimationListener {
                override fun onAnimationRepeat(p0: Animation?) {
                }
                override fun onAnimationStart(p0: Animation?) {
                }
                override fun onAnimationEnd(p0: Animation?) {
                    view.visibility = View.GONE
                }
            })

        }
    }

}
