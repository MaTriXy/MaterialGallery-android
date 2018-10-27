package com.numero.material_gallery.activity.bottom_app_bar

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.numero.material_gallery.R
import kotlinx.android.synthetic.main.activity_bottom_app_bar.*

class HideOnScrollActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hide_on_scroll)
        setSupportActionBar(toolbar)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_arrow_back)
        }

        fab.setOnClickListener {
            Toast.makeText(this@HideOnScrollActivity, "Clicked FAB", Toast.LENGTH_SHORT).show()
        }

        bottomAppBar.replaceMenu(R.menu.bottom_app_bar)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, HideOnScrollActivity::class.java)
    }
}