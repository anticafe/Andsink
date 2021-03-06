/**
 * 
 */
package fr.playsoft.andsink.view;

import fr.playsoft.andsink.BaseListActivity;


/**
 * @author Admin
 *
 */
public class TabBar extends BaseListActivity {
	
	/* (non-Javadoc)
	 * @see fr.playsoft.android.kstemplate.SetupLayoutListener#setupOthersInTitleBar()
	 */
	@Override
	public void setupOthersInTitleBar() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.playsoft.android.kstemplate.SetupLayoutListener#setupAboutContent()
	 */
	@Override
	public void setupAboutContent() {
		ACTIVITY_INFO = "Example about Android View Animation effect:<br />" +
				"- Grid Fade<br />" +
				"- List Cascade<br />" +
				"- Reverse order<br />" +
				"- Randomize<br />" +
				"- Grid Direction<br />" +
				"- Wave scale<br />" +
				"- Nested Animations<br />";
		
		 ACTIVITY_USING_RES = 
			 "<b>Java file:</b><br />" +
		 		"- ViewAnimations.java<br />" +
		 		"<b>XML</b><br />" +
		 		"- Main layout: ks_list_template<br />" +
		 		"- Layout: ks_list_row.xml, ks_custom_titlebar<br />" +
		 		"- color.xml<br />" +
		 		"- dimensions.xml<br />" +
		 		"- Android Manifest<br />" +
		 		"<b>Drawable</b><br />" +
		 		"- ks_list_row_selector.xml<br />";

	}

	/* (non-Javadoc)
	 * @see fr.playsoft.android.kstemplate.BaseListActivity#setupListData()
	 */
	@Override
	public void setupListData() {
		
		LISTDATA.add(new String[] {"Creating tabbar", 
				"There are many ways to create Android tabbar",	
				"fr.playsoft.andsink.view.tabbar.CreatingTab"});
		
		LISTDATA.add(new String[] {"Tabbar position", 
				"Change tabbar position in screen",	
				"fr.playsoft.andsink.view.tabbar.TabPosition"});
		
		LISTDATA.add(new String[] {"Tabbar Event", 
				"Catching tabbar event such as onTouch, onClick...",	
				"fr.playsoft.andsink.view.tabbar.TabEvent"});
		
		LISTDATA.add(new String[] {"Customize tabbar", 
				"Customize tabbar appearance, make tabbar more eye-catching",	
				"fr.playsoft.andsink.view.tabbar.TabCustom"});
		
		LISTDATA.add(new String[] {"Sample", 
				"Collective and high quality samples of tabbar, often use in real project",	
				"fr.playsoft.andsink.view.tabbar.TabSample"});
		
	}

	@Override
	public void setupTitleBarNameStr() {
//		 ACTIVITY_NAME = "View Animations"; //Activity name 
		
	}

}
