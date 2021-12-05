package ucf.assignments;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Mohammed Almeaither
 */
public class java {
  <RelativeLayout
 xmIns:android="http://schemas.android.com/apk/res/android" xmlns.tools="http://schemas.android.com/tools" android:layout_width="match_parent" android:layout_height="match_parent" tools:context=".MainActivity">
 <ListView android:layout width="wrap_content" android:layout_height="wrap_content", android:id="@+id/Ivltems" android:layout_alignParentTop="true" android:layout alignParentLeft="true" android:layout alignParentStart="true" android:layout_above="@+id/btnAddltem" /> 
<EditText android:layout width="wrap_content" android:layout height="wrap_content" android:id="@+id/etNewltem" android:layout alignTop="@+id/btnAddltem" android:hint="Enter a new item" android:layout alignParentLeft="true"
android:layout alignParentStart="true" android:layout toLeftOf="@+id/btnAddltem" android:layout_toStartOf="@+id/btnAddltem" android:layout alignParentBottom="true" /> 
<Button android:layout width="wrap_content" android:layout height="wrap_content" android:text="Add Item" android:id3"@+id/btnAddltem" android:layout alignParentBottom="true" android:layout alignParentRight="true" android:layout alignParentEnd="true" 
</RelativeLayout> 
public class MainActivity extends Activity { 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
}

public boolean onCreateOptionsMenu(Menu menu) { 
// Inflate the menu; this adds items to the action bar if it is present. getMenulnflater().inflate(R.menu.main, menu); 
return true; 
}
}
public class MainActivity extends Activity { 
private ArrayList<String> items; 
private ArrayAdapter<String> itemsAdapter; private ListView Ivltems; 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); setContentView(R.layout.activity_main); Ivltems = (ListView) findViewByld(R.id.Ivltems); 
items = new ArrayList<String>(); itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items); 

Ivltems.setAdapter(itemsAdapter); items.add("First Item"); items.add("Second Item"); 
}
}
<Button 
android:layout width="wrap_content" android:layout_height="wrap_content" android:text="Add Item" android:id="@+id/btnAddltem" android:layout alignParentBottom="true" android:layout alignParentRight="true" android:layout alignParentEnd="true" android:onClick="onAddltem" 
</ 
public class MainActivity extends Activity{ 
// ...onCreate method 
public void onAddltem(View v) {
Edit Text etNewltem = (EditText) findViewByld(R.id.etNewltem);

StringitemText=etNewltem.getText().toString(); 
itemsAdapter.add(itemText); etNewltem.setText(""); 
}
}
public class MainActivity extends Activity { 
// variable declarations
 @Override 
protected void onCreate(Bundle savedinstanceState) { 
// ... existing code .. 
items.add("Second Item"); 

} catch (1OException e) { 
items = new ArayList<String>();
}
}

private void writeltems() { 
File filesDir = getFilesDir(); 
File todoFile = new File(filesDir, "todo.txt"); 
try {
FileUtils.writeLines(todoFile, items); 
} catch (1OException e { 
e.printStackTrace(); 
}
}
}
public class MainActivity extends Activity{ 
@Override 
protected void onCreate(Bundle savedinstanceState) { 
readitems(); /l <– Add this line 
itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
}

private void setupListViewListener(){ 
Ivltems.setOnltemLongClickListener( 
new AdapterView.OnltemLongClickListener() {

public boolean onltemLongClick(AdapterView<?> adapter, View item, int pos, long id) { 
items.remove(pos); itemsAdapter.notifyDataSetChanged(0; writeltems(); 
setupListViewListener(); 
}
private void setupListViewListener(){ 
Ivltems.setOnltemLongClickListener( 
new AdapterView.OnltemLongClickListener(){
public boolean onltemLongClick(AdapterView<?> adapter, View item, int pos, long id) { 
// Remove the item within array at position items.remove(pos); 
// Refresh the adapter itemsAdapter.notifyDataSetChanged();
return true;
}
});
}

}

public class MainActivity  extends Activity { 
private void readltems() { 
File filesDir = getFilesDir(); 
File todoFile = new File(filesDir, "todo.txt"); 
try { 
items = new ArrayList<String>(FileUtils.readLines(todoFile)); 
} catch (1OException e) { 
return true; 
}
});
}
public void onAddltem(View v) { 
EditText etNewltem = (EditText) findViewByld(R.id.etNewltem); 
String item Text = etNewltem.getText().toStrinq(); itemsAdapter.add(item Text); etNewltem.setText("); 
writeltems();
}
}
}
