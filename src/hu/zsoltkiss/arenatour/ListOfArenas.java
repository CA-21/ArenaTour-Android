package hu.zsoltkiss.arenatour;

import hu.zsoltkiss.arenatour.model.Arena;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListOfArenas extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_of_arenas);
		
		final ListView listView = (ListView) findViewById(R.id.listView1);
		ArrayAdapter<String> adapter = getAdapter();
		listView.setAdapter(adapter);

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list_of_arenas, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		} 
		
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_list_of_arenas,
					container, false);
			return rootView;
		}
	}
	
	private ArrayAdapter<String> getAdapter() {
		List<String> names = new ArrayList<String>();
		
		for (Arena a : ListOfArenas.getSpots()) {
			names.add(a.getName());
		}
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
		
		
		return adapter;
	}
	
	private final static List<Arena> getSpots() {
		List<Arena> arenas = new ArrayList<Arena>();
		
		Arena a1 = new Arena();
		a1.setTeam("�jpest FC");
		a1.setName("Szusza Ferenc Stadion");
		a1.setAddress("Megyeri �t 6.");
		a1.setCapacity(13501);
		a1.setLatitude(47.576036);
		a1.setLongitute(19.083754);
		
		Arena a2 = new Arena();
		a2.setTeam("Budapest Honv�d FC");
		a2.setName("Bozsik J�zsef Stadion");
		a2.setAddress("Pusk�s Ferenc utca 1-3");
		a2.setCapacity(9500);
		a2.setLatitude(47.443579);
		a2.setLongitute(19.155585);
		
		Arena a3 = new Arena();
		a3.setTeam("MTK Budapest FC");
		a3.setName("Hidegkuti N�ndor Stadion");
		
		Arena a4 = new Arena();
		a4.setTeam("Ferencv�rosi TC");
		a4.setName("Alber Fl�ri�n Stadion");
		
		Arena a5 = new Arena();
		a5.setTeam("Debereceni Vasutas SC-TEVA");
		a5.setName("Nagyerdei Stadion");
		
		Arena a6 = new Arena();
		a6.setTeam("Pusk�s Akad�mia FC");
		a6.setName("Pusk�s Akad�mia Pancho Ar�na");
		
		Arena a7 = new Arena();
		a7.setTeam("Gy�ri ETO FC");
		a7.setName("ETO Park");
		
		Arena a8 = new Arena();
		a8.setTeam("Kaposv�ri R�k�czi FC");
		a8.setName("R�k�czi Stadion");
		
		Arena a9 = new Arena();
		a9.setTeam("Kecskem�ti TE-Phoenix Mecano");
		a9.setName("Sz�kt�i Stadion");
		
		Arena a10 = new Arena();
		a10.setTeam("Mez�k�vesd Zs�ry FC");
		a10.setName("Mez�k�vesdi V�rosi Stadion");
		
		Arena a11 = new Arena();
		a11.setTeam("Di�sgy�ri VTK");
		a11.setName("DVTK Stadion");
		
		Arena a12 = new Arena();
		a12.setTeam("MVM-Paksi FC");
		a12.setName("Feh�rv�ri �ti Stadion");
		
		Arena a13 = new Arena();
		a13.setTeam("Lombard P�pa Term�l FC");
		a13.setName("Perutz Stadion");
		
		
		Arena a14 = new Arena();
		a14.setTeam("P�csi Mecsek FC-Matias");
		a14.setName("PMFC Stadion");
		
		Arena a15 = new Arena();
		a15.setTeam("Videoton FC");
		a15.setName("S�st�i Stadion");
		
		Arena a16 = new Arena();
		a16.setTeam("Szombathelyi Halad�s");
		a16.setName("Rohonci �ti Stadion");
		
		arenas.add(a1);
		arenas.add(a2);
		arenas.add(a3);
		arenas.add(a4);
		arenas.add(a5);
		arenas.add(a6);
		arenas.add(a7);
		arenas.add(a8);
		arenas.add(a9);
		arenas.add(a10);
		arenas.add(a11);
		arenas.add(a12);
		arenas.add(a13);
		arenas.add(a14);
		arenas.add(a15);
		arenas.add(a16);
		
		return arenas;
	}

}
