package ui;

import ui.view.SlideDrawerView;

import com.sheldon.whisper.R;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
/**
 * whisper
 *
 * @author Sheldon
 *
 */
public class MainActivity extends FragmentActivity{
//	protected SlidingMenu side_drawer;
	
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.main);
		initSlidingMenu();
	}
	
	protected void initSlidingMenu() {
//		side_drawer = new SlideDrawerView(this).initSlidingMenu();
	}
}
