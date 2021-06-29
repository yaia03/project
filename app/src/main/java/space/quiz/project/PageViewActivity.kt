package space.quiz.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TabHost
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class PageViewActivity : AppCompatActivity() {

    private lateinit var vp: ViewPager
    private lateinit var tab: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_view)
        vp = findViewById(R.id.view_pager_vp)
        tab = findViewById(R.id.page_tabs)
        vp.adapter = ViewPagerAdapter(supportFragmentManager)
        tab.setupWithViewPager(vp)

    }


    inner class ViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){
        override fun getItem(position: Int): Fragment {
            return when(position){
                0 -> FragmentOne()
                1 -> FragmentTwo()
                else -> FragmentThree()
            }
        }



        override fun getCount(): Int {
            return 3
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return when(position) {
                0 -> "1"
                1 -> "2"
                else -> "2"
            }
        }

    }
}