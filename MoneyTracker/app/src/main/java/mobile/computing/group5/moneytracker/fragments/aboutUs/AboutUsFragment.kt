package mobile.computing.group5.moneytracker.fragments.aboutUs

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import mobile.computing.group5.moneytracker.R

/**
 * main fragment class to inflate the fragment_aboutus xml.
 */
class AboutUsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mInflater = activity!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = mInflater.inflate(R.layout.fragment_aboutus, container, false)
        setHasOptionsMenu(true)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == 16908332){  // back button functionality
            findNavController().navigate(R.id.action_navigation_aboutus_to_navigation_more)
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}