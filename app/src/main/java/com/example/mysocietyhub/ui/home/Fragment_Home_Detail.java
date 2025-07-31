package com.example.mysocietyhub.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieDrawable;
import com.example.mysocietyhub.R;
import com.example.mysocietyhub.databinding.ActivityFragmentHomeDetailBinding;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Home_Detail extends AppCompatActivity {

    ActivityFragmentHomeDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFragmentHomeDetailBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


        int positions = getIntent().getIntExtra("number", 1);

        String itemName = getIntent().getStringExtra("item");


        if (itemName.equals("Water Supply")) {

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.wateranimation);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(itemName);


            List<String> waterTimings = new ArrayList<>();
            waterTimings.add("Monday     - 6 AM to 9 AM");
            waterTimings.add("Tuesday    - 7 AM to 10 AM");
            waterTimings.add("Wednesday  - No Supply");
            waterTimings.add("Thursday   - 6 AM to 9 AM");
            waterTimings.add("Friday     - 7 AM to 10 AM");
            waterTimings.add("Saturday   - 6 AM to 8 AM");
            waterTimings.add("Sunday     - 8 AM to 11 AM");

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, waterTimings);
            binding.fragmentHomeDetailListview.setAdapter(adapter);


        }
        else if (itemName.equals("Notices")) {

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.notify);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(itemName);

            List<String> notices = new ArrayList<>();

            notices.add("Notice 1: Society meeting on 15th Aug at 5 PM");
            notices.add("Notice 2: Gym will be closed on Sunday");
            notices.add("Notice 3: Water tank cleaning on Friday");
            notices.add("Notice 4: Parking allocation updated");
            notices.add("Notice 5: New library books available");
            notices.add("Notice 6: Electricity maintenance on 10th Aug");
            notices.add("Notice 7: Diwali celebration on 1st Nov");

            ArrayAdapter<String> noticeAdapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    notices
            );
            binding.fragmentHomeDetailListview.setAdapter(noticeAdapter);


        }
        else if (itemName.equals("Electricity Info")) {

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.electricity);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(itemName);


            List<String> electricityInfo = new ArrayList<>();
            electricityInfo.add("Power Supply: 9 AM to 5 PM (Mon to Fri)");
            electricityInfo.add("Backup Generator Available: Yes");
            electricityInfo.add("Maintenance Schedule: Every Saturday");
            electricityInfo.add("Inverter Backup: 6 Hours");
            electricityInfo.add("Emergency Contact: 9876543210");
            electricityInfo.add("Next Maintenance Date: 3rd Aug");
            electricityInfo.add("Voltage Fluctuation Alert: None Reported");

            ArrayAdapter<String> adapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    electricityInfo
            );
            binding.fragmentHomeDetailListview.setAdapter(adapter);


        }
        else if (itemName.equals("Lost & Found")) {

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.lost_found);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(itemName);

            List<String> lostFoundItems = new ArrayList<>();
            lostFoundItems.add("Lost: Black Wallet near Gate 2 on 28th July");
            lostFoundItems.add("Found: Set of keys in Parking Lot A");
            lostFoundItems.add("Lost: Samsung phone in Garden area");
            lostFoundItems.add("Found: School bag outside Building B");
            lostFoundItems.add("Lost: Gold earring in Community Hall");
            lostFoundItems.add("Found: Water bottle with 'Anjali' name");
            lostFoundItems.add("Lost: Watch near the Library");

            ArrayAdapter<String> adapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    lostFoundItems
            );
            binding.fragmentHomeDetailListview.setAdapter(adapter);

        }
        else if (itemName.equals("Branches")) {

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.branch);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(itemName);

            List<String> societyBranches = new ArrayList<>();
            societyBranches.add("Maintenance Department");
            societyBranches.add("Security & Safety");
            societyBranches.add("Water Supply");
            societyBranches.add("Electricity Board");
            societyBranches.add("Lost & Found");
            societyBranches.add("Community Hall");
            societyBranches.add("Temple / Masjid / Gurudwara");
            societyBranches.add("Library");
            societyBranches.add("Available Flats");
            societyBranches.add("Gardening & Cleanliness");

            ArrayAdapter<String> branchAdapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    societyBranches
            );

            binding.fragmentHomeDetailListview.setAdapter(branchAdapter);

        }
        else if (itemName.equals("Maintenance Request")) {

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.maintenance);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(itemName);

            //  Dummy deta

            List<String> maintenanceList = new ArrayList<>();
            maintenanceList.add("Plumber - 9876543210");
            maintenanceList.add("Electrician - 9123456789");
            maintenanceList.add("Carpenter - 9988776655");
            maintenanceList.add("AC Repair - 8899776655");
            maintenanceList.add("Lift Technician - 9001122334");
            maintenanceList.add("Pest Control - 9345678901");
            maintenanceList.add("Building Repair - 9112233445");
            maintenanceList.add("Common Lighting - 9332211007");

            ArrayAdapter<String> adapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    maintenanceList
            );

            binding.fragmentHomeDetailListview.setAdapter(adapter);

            // Click Listner to open diler
            binding.fragmentHomeDetailListview.setOnItemClickListener((parent, view, position, id) -> {

                String selectedItem = maintenanceList.get(position);
                String number = selectedItem.replaceAll("[^0-9]", ""); // extract only numbers

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            });
        }

        else if (itemName.equals("Emergency Contacts")) {

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.maintenance);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(itemName);

            List<String> emergencyContacts = new ArrayList<>();
            emergencyContacts.add("Police: 100");
            emergencyContacts.add("Fire Brigade: 101");
            emergencyContacts.add("Ambulance: 102");
            emergencyContacts.add("Electricity Emergency: 1912");
            emergencyContacts.add("Water Supply Emergency: 1800-123-456");
            emergencyContacts.add("Security Guard: +91-9876543210");
            emergencyContacts.add("Society Manager: +91-9123456789");

            ArrayAdapter<String> contactAdapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    emergencyContacts
            );

            binding.fragmentHomeDetailListview.setAdapter(contactAdapter);

            // using click open diler

            binding.fragmentHomeDetailListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String selectedItem = emergencyContacts.get(position);


                    String number = selectedItem.replaceAll("[^0-9]", "");

                    // Open Diler

                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:" + number));
                    startActivity(dialIntent);
                }
            });


        }
        else if (itemName.equals("Avaliable Flat")) {

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.maintenance);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(itemName);

            List<String> emergencyContacts = new ArrayList<>();
            emergencyContacts.add("Police: 100");
            emergencyContacts.add("Fire Brigade: 101");
            emergencyContacts.add("Ambulance: 102");
            emergencyContacts.add("Electricity Emergency: 1912");
            emergencyContacts.add("Water Supply Emergency: 1800-123-456");
            emergencyContacts.add("Security Guard: +91-9876543210");
            emergencyContacts.add("Society Manager: +91-9123456789");

            ArrayAdapter<String> contactAdapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    emergencyContacts
            );

            binding.fragmentHomeDetailListview.setAdapter(contactAdapter);





        }

    }


}
