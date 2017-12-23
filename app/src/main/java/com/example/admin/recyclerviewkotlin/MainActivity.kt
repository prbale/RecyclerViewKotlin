package com.example.admin.recyclerviewkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.rvAndroidVersions
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAndroidVersions.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayout.VERTICAL, false)
            addItemDecoration(LinearLayoutSpaceItemDecoration(16))
        }

        // Populate Data
        val allMyAndroidOS = populateData()

        rvAndroidVersions.adapter = MyAndroidAdapter(allMyAndroidOS) {
            toast("${it.employeeName} Clicked")
        }

    }

    private fun populateData() = arrayListOf<Employee>().apply {
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
        add(Employee(employeeName = "Prashant Bale", employeeCategory= "Developer", employeeId = "44037722"))
    }
}
