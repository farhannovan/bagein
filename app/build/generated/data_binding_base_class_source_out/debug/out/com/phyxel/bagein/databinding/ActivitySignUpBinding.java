// Generated by view binder compiler. Do not edit!
package com.phyxel.bagein.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phyxel.bagein.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignUpBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton btnBack;

  @NonNull
  public final AppCompatButton btnLogin;

  @NonNull
  public final AppCompatButton btnRegis;

  @NonNull
  public final LinearLayout email;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final EditText etUsername;

  @NonNull
  public final LinearLayout fbtnRegis;

  @NonNull
  public final LinearLayout password;

  @NonNull
  public final TextView tDaftar;

  @NonNull
  public final RelativeLayout titleBarAktivitasMisi;

  @NonNull
  public final TextView tvEmail;

  @NonNull
  public final TextView tvPassword;

  @NonNull
  public final TextView tvSignUpH1;

  @NonNull
  public final TextView tvSignUpH2;

  @NonNull
  public final TextView tvUsername;

  @NonNull
  public final LinearLayout username;

  private ActivitySignUpBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton btnBack,
      @NonNull AppCompatButton btnLogin, @NonNull AppCompatButton btnRegis,
      @NonNull LinearLayout email, @NonNull EditText etEmail, @NonNull EditText etPassword,
      @NonNull EditText etUsername, @NonNull LinearLayout fbtnRegis, @NonNull LinearLayout password,
      @NonNull TextView tDaftar, @NonNull RelativeLayout titleBarAktivitasMisi,
      @NonNull TextView tvEmail, @NonNull TextView tvPassword, @NonNull TextView tvSignUpH1,
      @NonNull TextView tvSignUpH2, @NonNull TextView tvUsername, @NonNull LinearLayout username) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnLogin = btnLogin;
    this.btnRegis = btnRegis;
    this.email = email;
    this.etEmail = etEmail;
    this.etPassword = etPassword;
    this.etUsername = etUsername;
    this.fbtnRegis = fbtnRegis;
    this.password = password;
    this.tDaftar = tDaftar;
    this.titleBarAktivitasMisi = titleBarAktivitasMisi;
    this.tvEmail = tvEmail;
    this.tvPassword = tvPassword;
    this.tvSignUpH1 = tvSignUpH1;
    this.tvSignUpH2 = tvSignUpH2;
    this.tvUsername = tvUsername;
    this.username = username;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBack;
      ImageButton btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnLogin;
      AppCompatButton btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.btnRegis;
      AppCompatButton btnRegis = ViewBindings.findChildViewById(rootView, id);
      if (btnRegis == null) {
        break missingId;
      }

      id = R.id.email;
      LinearLayout email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.etEmail;
      EditText etEmail = ViewBindings.findChildViewById(rootView, id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.etPassword;
      EditText etPassword = ViewBindings.findChildViewById(rootView, id);
      if (etPassword == null) {
        break missingId;
      }

      id = R.id.etUsername;
      EditText etUsername = ViewBindings.findChildViewById(rootView, id);
      if (etUsername == null) {
        break missingId;
      }

      id = R.id.fbtnRegis;
      LinearLayout fbtnRegis = ViewBindings.findChildViewById(rootView, id);
      if (fbtnRegis == null) {
        break missingId;
      }

      id = R.id.password;
      LinearLayout password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.tDaftar;
      TextView tDaftar = ViewBindings.findChildViewById(rootView, id);
      if (tDaftar == null) {
        break missingId;
      }

      id = R.id.titleBarAktivitasMisi;
      RelativeLayout titleBarAktivitasMisi = ViewBindings.findChildViewById(rootView, id);
      if (titleBarAktivitasMisi == null) {
        break missingId;
      }

      id = R.id.tvEmail;
      TextView tvEmail = ViewBindings.findChildViewById(rootView, id);
      if (tvEmail == null) {
        break missingId;
      }

      id = R.id.tvPassword;
      TextView tvPassword = ViewBindings.findChildViewById(rootView, id);
      if (tvPassword == null) {
        break missingId;
      }

      id = R.id.tvSignUpH1;
      TextView tvSignUpH1 = ViewBindings.findChildViewById(rootView, id);
      if (tvSignUpH1 == null) {
        break missingId;
      }

      id = R.id.tvSignUpH2;
      TextView tvSignUpH2 = ViewBindings.findChildViewById(rootView, id);
      if (tvSignUpH2 == null) {
        break missingId;
      }

      id = R.id.tvUsername;
      TextView tvUsername = ViewBindings.findChildViewById(rootView, id);
      if (tvUsername == null) {
        break missingId;
      }

      id = R.id.username;
      LinearLayout username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      return new ActivitySignUpBinding((ConstraintLayout) rootView, btnBack, btnLogin, btnRegis,
          email, etEmail, etPassword, etUsername, fbtnRegis, password, tDaftar,
          titleBarAktivitasMisi, tvEmail, tvPassword, tvSignUpH1, tvSignUpH2, tvUsername, username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}