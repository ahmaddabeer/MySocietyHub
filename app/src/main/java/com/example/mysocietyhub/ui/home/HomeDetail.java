package com.example.mysocietyhub.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieDrawable;
import com.example.mysocietyhub.R;
import com.example.mysocietyhub.databinding.ActivityHomeDetailBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HomeDetail extends AppCompatActivity {

    ActivityHomeDetailBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        binding = ActivityHomeDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.homeDetailToolbar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);





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

        }

        else if (name.equals("Notices")) {
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

        }
        else if (name.equals("Electricity Info")) {
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

        }
        else if (name.equals("Lost & Found")) {
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

        }
        else if (name.equals("Branches")) {
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

        }
        else if (name.equals("Maintenance Request")) {
            Toast.makeText(this, "Dummy details", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.maintain);
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

        }
        else if (name.equals("Emergency Contacts")) {
            Toast.makeText(this, "Dummy details", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.alert);
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

        }else if (name.equals("Available Flat")) {
            Toast.makeText(this, "Showing available flats...", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.notify); // Optional: Use relevant Lottie animation
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

            List<String> flatDetails = new ArrayList<>();
            flatDetails.add("Flat A-101: 2BHK, 900 sqft, ₹35 Lakhs");
            flatDetails.add("Flat B-204: 3BHK, 1200 sqft, ₹50 Lakhs");
            flatDetails.add("Flat C-305: 1BHK, 600 sqft, ₹25 Lakhs");
            flatDetails.add("Flat D-406: 2BHK, 950 sqft, ₹38 Lakhs");
            flatDetails.add("Flat E-507: 3BHK, 1300 sqft, ₹55 Lakhs");
            flatDetails.add("Flat F-608: Studio, 450 sqft, ₹18 Lakhs");

            ArrayAdapter<String> flatAdapter = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    flatDetails
            );
            binding.fragmentHomeDetailListview.setAdapter(flatAdapter);
        }else if (name.equals("Park Timings")) {
            Toast.makeText(this, "Showing available Timing...", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.timing); // Optional: Use relevant Lottie animation
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
        }else if (name.equals("Events Calendar")) {
            Toast.makeText(this, "Showing upcoming events...", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.events); // Optional: Use relevant Lottie animation
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

            List<String> eventList = new ArrayList<>();
            eventList.add("15 Aug - Independence Day Flag Hoisting - 9:00 AM");
            eventList.add("20 Aug - Society Cleaning Drive - 7:30 AM");
            eventList.add("25 Aug - Blood Donation Camp - 10:00 AM");
            eventList.add("01 Sep - Ganesh Chaturthi Celebration - 6:00 PM");
            eventList.add("05 Sep - Teachers Day Function - 5:00 PM");
            eventList.add("10 Sep - Fire Safety Drill - 11:00 AM");
            eventList.add("14 Sep - Hindi Diwas Cultural Program - 4:00 PM");
            eventList.add("20 Sep - Monthly General Meeting - 6:30 PM");
            eventList.add("24 Sep - Movie Night - 8:00 PM");
            eventList.add("30 Sep - Medical Checkup Camp - 9:00 AM");
            eventList.add("02 Oct - Gandhi Jayanti Cleanliness March - 8:00 AM");
            eventList.add("10 Oct - Navratri Garba Night - 7:00 PM");
            eventList.add("15 Oct - Society Sports Day - 9:00 AM to 5:00 PM");
            eventList.add("20 Oct - Diwali Decoration Competition - 6:00 PM");
            eventList.add("25 Oct - Children's Day Celebration - 5:00 PM");
            eventList.add("30 Oct - Halloween Costume Party - 7:00 PM");

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, eventList);
            binding.fragmentHomeDetailListview.setAdapter(adapter);
        }else if (name.equals("Complaint Box")) {
            Toast.makeText(this, "Fetching recent complaints...", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.maintain); // Use your complain-related Lottie animation
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

            List<String> complaintList = new ArrayList<>();
            complaintList.add("Leakage in Block A - Reported on 01 Aug");
            complaintList.add("Street light not working near Gate 2 - 02 Aug");
            complaintList.add("Lift issue in Tower 3 - 03 Aug");
            complaintList.add("Garbage collection delay - 04 Aug");
            complaintList.add("Security guard misbehavior - 05 Aug");
            complaintList.add("Water supply disruption - 06 Aug");
            complaintList.add("Stray dogs inside premises - 07 Aug");
            complaintList.add("Noise complaint from Flat 302 - 08 Aug");
            complaintList.add("Broken tiles in parking area - 09 Aug");
            complaintList.add("Blocked drainage in Block B - 10 Aug");
            complaintList.add("Gym AC not working - 11 Aug");
            complaintList.add("Intercom issue - 12 Aug");
            complaintList.add("Unauthorized parking near main gate - 13 Aug");
            complaintList.add("CCTV camera not functional - 14 Aug");
            complaintList.add("Elevator light blinking continuously - 15 Aug");

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, complaintList);
            binding.fragmentHomeDetailListview.setAdapter(adapter);
        }else if (name.equals("Visitor Entry Log")) {
            Toast.makeText(this, "Fetching visitor logs...", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.validation); // Use your visitor-related Lottie animation
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

            List<String> visitorLog = new ArrayList<>();
            visitorLog.add("01 Aug - Mr. Sharma (Plumber) - Flat 102 - In: 10:00 AM, Out: 11:00 AM");
            visitorLog.add("01 Aug - Ms. Rani (Maid) - Flat 205 - In: 8:30 AM, Out: 12:00 PM");
            visitorLog.add("02 Aug - Mr. Verma (Delivery) - Flat 310 - In: 4:15 PM, Out: 4:25 PM");
            visitorLog.add("02 Aug - Electrician - Flat 401 - In: 11:00 AM, Out: 12:30 PM");
            visitorLog.add("03 Aug - Zomato Delivery - Flat 203 - In: 1:20 PM, Out: 1:25 PM");
            visitorLog.add("03 Aug - Mr. Joshi (Relative) - Flat 105 - In: 6:00 PM, Out: 9:00 PM");
            visitorLog.add("04 Aug - Flipkart Delivery - Flat 301 - In: 2:00 PM, Out: 2:10 PM");
            visitorLog.add("04 Aug - Newspaper Agent - Common Area - In: 7:00 AM, Out: 7:15 AM");
            visitorLog.add("05 Aug - Cleaner - Flat 206 - In: 9:30 AM, Out: 10:45 AM");
            visitorLog.add("05 Aug - Mr. Ali (Guest) - Flat 108 - In: 5:00 PM, Out: 7:30 PM");
            visitorLog.add("06 Aug - Swiggy Delivery - Flat 202 - In: 8:00 PM, Out: 8:10 PM");
            visitorLog.add("06 Aug - Mr. Singh (Electrician) - Flat 304 - In: 3:30 PM, Out: 4:30 PM");
            visitorLog.add("07 Aug - Courier - Flat 207 - In: 10:15 AM, Out: 10:25 AM");
            visitorLog.add("07 Aug - Cable Technician - Flat 402 - In: 12:00 PM, Out: 1:00 PM");
            visitorLog.add("07 Aug - Mr. Khan (Friend) - Flat 109 - In: 6:15 PM, Out: 8:45 PM");

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, visitorLog);
            binding.fragmentHomeDetailListview.setAdapter(adapter);
        }else if (name.equals("Billing Info")) {
            Toast.makeText(this, "Fetching billing information...", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.billing); // Use a suitable billing-related Lottie animation
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

            List<String> billingList = new ArrayList<>();
            billingList.add("Jan 2024 - Maintenance: ₹1200, Electricity: ₹850, Water: ₹150 - Paid");
            billingList.add("Feb 2024 - Maintenance: ₹1200, Electricity: ₹910, Water: ₹150 - Paid");
            billingList.add("Mar 2024 - Maintenance: ₹1200, Electricity: ₹780, Water: ₹150 - Paid");
            billingList.add("Apr 2024 - Maintenance: ₹1200, Electricity: ₹1020, Water: ₹150 - Paid");
            billingList.add("May 2024 - Maintenance: ₹1200, Electricity: ₹960, Water: ₹150 - Paid");
            billingList.add("Jun 2024 - Maintenance: ₹1200, Electricity: ₹880, Water: ₹150 - Paid");
            billingList.add("Jul 2024 - Maintenance: ₹1200, Electricity: ₹990, Water: ₹150 - Paid");
            billingList.add("Aug 2024 - Maintenance: ₹1200, Electricity: ₹1040, Water: ₹150 - Unpaid");
            billingList.add("Sep 2024 - Maintenance: ₹1200, Electricity: ₹870, Water: ₹150 - Unpaid");
            billingList.add("Oct 2024 - Maintenance: ₹1200, Electricity: ₹940, Water: ₹150 - Upcoming");
            billingList.add("Nov 2024 - Maintenance: ₹1200, Electricity: ₹910, Water: ₹150 - Upcoming");
            billingList.add("Dec 2024 - Maintenance: ₹1200, Electricity: ₹1000, Water: ₹150 - Upcoming");
            billingList.add("Security Charges (Yearly): ₹1500 - Paid");
            billingList.add("Parking Fee (Half-Yearly): ₹2000 - Paid");
            billingList.add("Club Membership (Optional): ₹2500 - Not Subscribed");

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, billingList);
            binding.fragmentHomeDetailListview.setAdapter(adapter);
        }else if (name.equals("Society Map")) {
            Toast.makeText(this, "Loading society map details...", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.location); // Use your society-map-related Lottie animation
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

            List<String> mapPoints = new ArrayList<>();
            mapPoints.add("Main Entrance Gate - Security Checkpoint");
            mapPoints.add("Tower A - Flats 101 to 110");
            mapPoints.add("Tower B - Flats 201 to 210");
            mapPoints.add("Tower C - Flats 301 to 310");
            mapPoints.add("Clubhouse - Gym, Pool & Indoor Games");
            mapPoints.add("Children's Park - Behind Tower B");
            mapPoints.add("Garden Area - Between Tower A & C");
            mapPoints.add("Community Hall - Near Clubhouse");
            mapPoints.add("Visitor Parking - Left of Main Gate");
            mapPoints.add("Resident Parking - Basement Level");
            mapPoints.add("Management Office - Ground Floor, Tower A");
            mapPoints.add("Grocery Store - Next to Main Entrance");
            mapPoints.add("Maintenance Room - Behind Tower C");
            mapPoints.add("Waste Collection Point - Near Exit Gate");
            mapPoints.add("Fire Assembly Area - Open Ground Near Park");

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mapPoints);
            binding.fragmentHomeDetailListview.setAdapter(adapter);
        }else if (name.equals("Emergency Alert")) {
            Toast.makeText(this, "Checking emergency alerts...", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.alert); // Use emergency-related Lottie animation
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

            List<String> emergencyAlerts = new ArrayList<>();
            emergencyAlerts.add("31 Jul - Fire Drill Scheduled - 3:00 PM");
            emergencyAlerts.add("30 Jul - Power Cut Notice - 12:00 AM to 6:00 AM");
            emergencyAlerts.add("28 Jul - Water Contamination Warning - Use boiled water only");
            emergencyAlerts.add("25 Jul - Heavy Rain Alert - Avoid basement parking");
            emergencyAlerts.add("22 Jul - Lift Stuck in Tower B - Use stairs temporarily");
            emergencyAlerts.add("20 Jul - Gas Leak Reported in Block C - Evacuated");
            emergencyAlerts.add("18 Jul - Unauthorized Person Sighting - Stay alert");
            emergencyAlerts.add("15 Jul - Security Breach Attempt at Gate 3");
            emergencyAlerts.add("10 Jul - Snake Spotted in Garden - Area closed");
            emergencyAlerts.add("07 Jul - Emergency Maintenance - Tower A Electrical Room");
            emergencyAlerts.add("05 Jul - First Aid Training Session - 11:00 AM");
            emergencyAlerts.add("02 Jul - Ambulance Entry - Flat 306 - 10:15 PM");
            emergencyAlerts.add("30 Jun - Fire in Garbage Area - Controlled");
            emergencyAlerts.add("28 Jun - Earthquake Tremor Felt - No damage reported");
            emergencyAlerts.add("25 Jun - Loud Blast Noise - Investigated, no threat found");

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, emergencyAlerts);
            binding.fragmentHomeDetailListview.setAdapter(adapter);
        }else if (name.equals("Society Rules")) {
            Toast.makeText(this, "Loading society rules...", Toast.LENGTH_SHORT).show();

            binding.lottieIcon.cancelAnimation();
            binding.lottieIcon.clearAnimation();
            binding.lottieIcon.setAnimation(R.raw.rules); // Use a suitable rules-related Lottie animation
            binding.lottieIcon.setRepeatCount(LottieDrawable.INFINITE);
            binding.lottieIcon.playAnimation();

            binding.title.setText(name);

            List<String> rulesList = new ArrayList<>();
            rulesList.add("1. No loud music after 10:00 PM.");
            rulesList.add("2. Pets must be leashed in common areas.");
            rulesList.add("3. Maintain cleanliness in staircases and corridors.");
            rulesList.add("4. Waste should be properly segregated (dry/wet).");
            rulesList.add("5. Do not park in non-designated areas.");
            rulesList.add("6. Visitors must be registered at the main gate.");
            rulesList.add("7. Use of clubhouse requires prior booking.");
            rulesList.add("8. Smoking is strictly prohibited in elevators and hallways.");
            rulesList.add("9. Children should not play in the parking area.");
            rulesList.add("10. No construction or repair work allowed on Sundays.");
            rulesList.add("11. Residents must attend monthly general meetings.");
            rulesList.add("12. Use of firecrackers is banned inside society premises.");
            rulesList.add("13. Residents must pay maintenance dues by the 10th of every month.");
            rulesList.add("14. Unauthorized alterations to flat exteriors are not allowed.");
            rulesList.add("15. Respect privacy and comfort of fellow residents.");

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, rulesList);
            binding.fragmentHomeDetailListview.setAdapter(adapter);
        }












    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed(); // Back jaane ka kaam karega
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}