package com.sim.nfc_semple;

import androidx.databinding.ObservableField;

import me.goldze.mvvmhabit.base.BaseViewModel;

public class LoginViewModel extends BaseViewModel {
    public LoginViewModel(@NonNull Application application) {
        super(application);
    }
    //用户名的绑定
    public ObservableField<String> userName = new ObservableField<>("998");
    //登录按钮的点击事件
    public View.OnClickListener loginOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}
