package com.example.qlkh_ph34050.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.qlkh_ph34050.Fragment.AddUserFragment;
import com.example.qlkh_ph34050.Fragment.HoaDonFragment;
import com.example.qlkh_ph34050.Fragment.PhieuNhapFragment;
import com.example.qlkh_ph34050.Fragment.PhieuXuatFragment;
import com.example.qlkh_ph34050.Fragment.ResetPasswordFragment;
import com.example.qlkh_ph34050.Fragment.SanPhamFragment;
import com.example.qlkh_ph34050.Fragment.TheloaiFragment;
import com.example.qlkh_ph34050.R;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView nav_view;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nav_view = findViewById(R.id.nav_view);
        drawerLayout = findViewById(R.id.drawlayout);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        SanPhamFragment sanPhamFragment = new SanPhamFragment();
        HoaDonFragment hoaDonFragment = new HoaDonFragment();
        AddUserFragment addUserFragment = new AddUserFragment();
        ResetPasswordFragment resetPasswordFragment = new ResetPasswordFragment();
        TheloaiFragment theloaiFragment = new TheloaiFragment();
        PhieuNhapFragment phieuNhapFragment = new PhieuNhapFragment();
        PhieuXuatFragment phieuXuatFragment = new PhieuXuatFragment();

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.nav_sanpham) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, sanPhamFragment).commit();
                    drawerLayout.close();
                } else if (item.getItemId() == R.id.nav_hoadon) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, hoaDonFragment).commit();
                    drawerLayout.close();
                } else if (item.getItemId() == R.id.nav_AddUser) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, addUserFragment).commit();
                    drawerLayout.close();
                } else if (item.getItemId() == R.id.nav_Pass) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, resetPasswordFragment).commit();
                    drawerLayout.close();
                } else if (item.getItemId() == R.id.nav_loaisp) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, theloaiFragment).commit();
                    drawerLayout.close();
                } else if (item.getItemId() == R.id.nav_nhap) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, phieuNhapFragment).commit();
                    drawerLayout.close();
                } else if (item.getItemId() == R.id.nav_xuat) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, phieuXuatFragment).commit();
                    drawerLayout.close();
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Đăng xuất")
                            .setMessage("Bạn có muốn đăng xuất không")
                            .setNegativeButton("Không", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            })
                            .setPositiveButton("Có", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(MainActivity.this, "Bạn đã đăng xuất!", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(MainActivity.this, Login.class));
                                }
                            });
                    builder.create();
                    builder.show();

                }
                return true;
            }
        });
    }
}