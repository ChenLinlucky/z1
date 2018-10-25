package com.example.dell.z1;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_1)
    Button btn1;
    @BindView(R.id.btn_2)
    Button btn2;
    @BindView(R.id.btn_3)
    Button btn3;
    @BindView(R.id.btn_4)
    Button btn4;
    @BindView(R.id.simp)
    SimpleDraweeView simp;
    private int width = 200;
    private int height = (int) (width * 2.71);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Uri uri = Uri.parse("https://www.zhaoapi.cn/images/quarter/ad1.png");
        final SimpleDraweeView simp = findViewById(R.id.simp);
        simp.setImageURI(uri);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.zhaoapi.cn/images/quarter/ad1.png");
                RoundingParams roundingParams1 = RoundingParams.fromCornersRadius(10f);
                roundingParams1.setRoundAsCircle(true);
                simp.getHierarchy().setRoundingParams(roundingParams1);
                simp.setImageURI(uri);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.zhaoapi.cn/images/quarter/ad1.png");
                RoundingParams roundingParams = RoundingParams.fromCornersRadius(10f);
                simp.getHierarchy().setRoundingParams(roundingParams);
                simp.setImageURI(uri);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.zhaoapi.cn/images/quarter/ad1.png");

                ViewGroup.LayoutParams layoutParams = simp.getLayoutParams();
                layoutParams.height = height;
                layoutParams.width = width;
                simp.setLayoutParams(layoutParams);
                simp.setImageURI(uri);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.zhaoapi.cn/images/girl.gif");
                DraweeController controller = Fresco.newDraweeControllerBuilder()
                        .setUri(uri)
                        .setAutoPlayAnimations(true)

                .build();
                simp.setController(controller);
            }
        });
    }
}
