package com.example.mysocietyhub.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieDrawable;
import com.example.mysocietyhub.R;
import com.example.mysocietyhub.databinding.ActivityHomeDetailBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeDetail extends AppCompatActivity {

    ActivityHomeDetailBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        binding = ActivityHomeDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String name = getIntent().getStringExtra("item");

        if (name.equals("Water Supply")) {
            Toast.makeText(this, "Dummy details", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.wateranimation);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

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

        } else if (name.equals("Notices")) {
            Toast.makeText(this, "Dummy details", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.notify);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

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

        } else if (name.equals("Electricity Info")) {
            Toast.makeText(this, "Dummy details", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.electricity);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

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

        } else if (name.equals("Lost & Found")) {
            Toast.makeText(this, "Dummy details", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.lost_found);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

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

        } else if (name.equals("Branches")) {
            Toast.makeText(this, "Dummy details", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.branch);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

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

        } else if (name.equals("Maintenance Request")) {
            Toast.makeText(this, "Dummy details", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.maintenance);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

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

            binding.fragmentHomeDetailListview.setOnItemClickListener((parent, view, position, id) -> {
                String selectedItem = maintenanceList.get(position);
                String number = selectedItem.replaceAll("[^0-9]", "");
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            });

        } else if (name.equals("Emergency Contacts")) {
            Toast.makeText(this, "Dummy details", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.maintenance);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

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

            binding.fragmentHomeDetailListview.setOnItemClickListener((parent, view, position, id) -> {
                String selectedItem = emergencyContacts.get(position);
                String number = selectedItem.replaceAll("[^0-9]", "");
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel:" + number));
                startActivity(dialIntent);
            });

        } else if (name.equals("Avaliable Flat")) {
            Toast.makeText(this, "Dummy details", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.maintenance);
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

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