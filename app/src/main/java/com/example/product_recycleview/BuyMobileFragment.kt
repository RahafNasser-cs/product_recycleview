package com.example.product_recycleview

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.product_recycleview.databinding.FragmentBuyMobileBinding


class BuyMobileFragment : Fragment() {
    var binding: FragmentBuyMobileBinding? = null

    lateinit var imageResourceInt: String
    lateinit var productName: String
    lateinit var productPrice: String
    lateinit var productUrl: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            imageResourceInt = it.getString(IMAGERESOURCE).toString()
            productName = it.getString(PRODUCTNAME).toString()
            productPrice = it.getString(PRODUCTPRICE).toString()
            productUrl = it.getString(PRODUCTURL).toString()
        }
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBuyMobileBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding!!.productImage.setImageResource(imageResourceInt.toInt())
        binding!!.productName.setText(productName)
        binding!!.productPrice.setText(productPrice)
        binding!!.moreInfoLink.setOnClickListener {
            gotoUrl(productUrl)
        }

        //action bar
        // calling the action ba
//        var myActionBar = getSupportActionBar()
//        // showing the back button in action bar
//        if (myActionBar != null) {
//            myActionBar.setDisplayHomeAsUpEnabled(true)
//        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    fun gotoUrl(str: String) {
        val uri = Uri.parse(str)
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }

    companion object {
        const val IMAGERESOURCE = "productImage"
        const val PRODUCTNAME = "productName"
        const val PRODUCTPRICE = "productPrice"
        const val PRODUCTURL = "ProducUrl"
    }
//    override fun onContextItemSelected(item: MenuItem): Boolean {
//        Log.e("BuyMobile","Item hom")
//        if(item.getItemId()== android.R.id.home){
//            this.finish();
//            return true;
//        }
//        return super.onContextItemSelected(item)
//    }--------------------------------------------------------
    //    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.layout_menu_back, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (item.itemId == R.id.back) {
//            val intent = Intent(this, MainActivity::class.java)
//            this.startActivity(intent)
//        }
//        return true
//    }
}