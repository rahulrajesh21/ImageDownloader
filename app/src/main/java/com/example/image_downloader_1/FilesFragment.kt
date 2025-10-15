package com.example.image_downloader_1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FilesFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View?{
        val view = inflater.inflate(R.layout.fragment_download,container,false)
        val add = view.findViewById<FloatingActionButton>(R.id.floatingActionButton2)

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
