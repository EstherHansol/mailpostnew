import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.mailpost.R
import com.example.mailpost.ui.home.HomeFragment
import com.example.mailpost.databinding.ActivityNaviBinding
import kotlinx.android.synthetic.main.fragment_home.*



private const val TAG_HOME = "home_fragment"
private const val TAG_MESSAGE = "message_fragment"
private const val TAG_BOX = "box_fragment"

class NaviActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNaviBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNaviBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setFragment(TAG_HOME, HomeFragment())

        binding.navigationView.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.MessageFragment -> setFragment(TAG_MESSAGE, MessageFragment())
                R.id.HomeFragment -> setFragment(TAG_HOME, HomeFragment())
                R.id.BoxFragment-> setFragment(TAG_BOX, BoxFragment())
            }
            true
        }
    }

    private fun setFragment(tag: String, fragment: Fragment) {
        val manager: FragmentManager = supportFragmentManager
        val fragTransaction = manager.beginTransaction()

        if (manager.findFragmentByTag(tag) == null){
            fragTransaction.add(R.id.mainFrameLayout, fragment, tag)
        }

        val message = manager.findFragmentByTag(TAG_MESSAGE)
        val home = manager.findFragmentByTag(TAG_HOME)
        val box = manager.findFragmentByTag(TAG_BOX)

        if (message != null){
            fragTransaction.hide(message)
        }

        if (home != null){
            fragTransaction.hide(home)
        }

        if (box != null) {
            fragTransaction.hide(box)
        }

        if (tag == TAG_MESSAGE) {
            if (message!=null){
                fragTransaction.show(message)
            }
        }
        else if (tag == TAG_HOME) {
            if (home != null) {
                fragTransaction.show(home)
            }
        }

        else if (tag == TAG_BOX){
            if (box != null){
                fragTransaction.show(box)
            }
        }

        fragTransaction.commitAllowingStateLoss()
    }
}
 