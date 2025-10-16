package com.example.image_downloader_1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.io.File




class FilesFragment: Fragment() {
    private lateinit var adapter: FileAdapter
    private lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View?{
        val view = inflater.inflate(R.layout.fragment_download,container,false)
        val add = view.findViewById<FloatingActionButton>(R.id.floatingActionButton2)

        recyclerView = view.findViewById(R.id.recyclerView)
        adapter = FileAdapter(mutableListOf())
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        val test1  = FileItem("Test1","239")
        val test2  = FileItem("Test2","23")
        val test3  = FileItem("Test1","29")
        val test4  = FileItem("Test1","39")
        adapter.addFile(test1)
        adapter.addFile(test2)
        adapter.addFile(test3)
        adapter.addFile(test4)


        add.setOnClickListener {showDialogBox()}
        return view
    }

    private fun showDialogBox(){
        val editText = EditText(requireContext())
        val dialogbox = layoutInflater.inflate(R.layout.dialog_download,null)

        AlertDialog.Builder(requireContext())
            .setView(dialogbox)
            .create()
            .show()


    }

}
