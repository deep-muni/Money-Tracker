package mobile.computing.group5.moneytracker.fragments.more

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_more.*
import mobile.computing.group5.moneytracker.R

/**
 * main class for more fragment to inflate the fragment_more.xml
 */
class MoreFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_more, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // handling navigation to four other fragments.
        button_statistics.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_more_to_navigation_statistics)
        }

        button_reset.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_more_to_navigation_reset)
        }

        button_about.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_more_to_navigation_about)
        }

        button_help.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_more_to_navigation_help)
        }
    }

}