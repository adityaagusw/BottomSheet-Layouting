package com.example.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModalButtonSheetActivity extends AppCompatActivity implements ExamplBottomSheet.BottomSheetListener{

    private TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modal_button_sheet);


        mTextView = findViewById(R.id.text_view_button_clicked);

        Button buttonOpenBottomSheet = findViewById(R.id.button_open_bottom_sheet);
        buttonOpenBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExamplBottomSheet bottomSheet = new ExamplBottomSheet();
                bottomSheet.show(getSupportFragmentManager(), "exampleBottomSheet");
            }
        });

    }

    @Override
    public void onButtonClicked(String text) {
        mTextView.setText(text);
    }

}
