package asm.asmtunis.com.androidcolorpicker

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_colors.*


/**
 * A simple [Fragment] subclass.
 */
class ColorsFragment(position: Int) : Fragment() {
     var position : Int?= position
     lateinit var color1 : ImageView
     lateinit var color2 : ImageView
     lateinit var color3 : ImageView
     lateinit var color4 : ImageView
     lateinit var color5 : ImageView
     lateinit var color6 : ImageView
     lateinit var color7 : ImageView
     lateinit var color8 : ImageView
     lateinit var color9 : ImageView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_colors, container, false)

        initialiseColorHolders(view)

        ChangeColor()

        return view
    }

    private fun ChangeColor() {
        val colorDrawable: GradientDrawable
        colorDrawable = GradientDrawable()
        colorDrawable.shape = GradientDrawable.OVAL
        var color= "#ff8a80"
        colorDrawable.setColor(Color.parseColor(color))
        color1.setImageDrawable(colorDrawable)
    }

    private fun initialiseColorHolders(view: View) {
        color1=view.findViewById(R.id.color1)
        color2=view.findViewById(R.id.color2)
        color3=view.findViewById(R.id.color3)
        color4=view.findViewById(R.id.color4)
        color5=view.findViewById(R.id.color5)
        color6=view.findViewById(R.id.color6)
        color7=view.findViewById(R.id.color7)
        color8=view.findViewById(R.id.color8)
        color9=view.findViewById(R.id.color9)
    }


}
