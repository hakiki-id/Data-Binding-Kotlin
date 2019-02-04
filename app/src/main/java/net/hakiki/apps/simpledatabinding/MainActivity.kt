package net.hakiki.apps.simpledatabinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import net.hakiki.apps.simpledatabinding.databinding.ActivityMainBinding
import net.hakiki.apps.simpledatabinding.models.UserModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        btnChange.setOnClickListener {
            binding.setVariable(BR.UserData, UserModel(edtFirstname.text.toString(), edtLastName.text.toString()))
            binding.executePendingBindings()
        }
    }
}
