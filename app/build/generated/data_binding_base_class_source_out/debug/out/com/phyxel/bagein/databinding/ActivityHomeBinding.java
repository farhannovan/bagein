// Generated by view binder compiler. Do not edit!
package com.phyxel.bagein.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phyxel.bagein.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ivMenu1;

  @NonNull
  public final ImageView ivMenu2;

  @NonNull
  public final ImageView ivMenu3;

  @NonNull
  public final FrameLayout layoutFrame;

  @NonNull
  public final LinearLayout linearLayout;

  private ActivityHomeBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivMenu1,
      @NonNull ImageView ivMenu2, @NonNull ImageView ivMenu3, @NonNull FrameLayout layoutFrame,
      @NonNull LinearLayout linearLayout) {
    this.rootView = rootView;
    this.ivMenu1 = ivMenu1;
    this.ivMenu2 = ivMenu2;
    this.ivMenu3 = ivMenu3;
    this.layoutFrame = layoutFrame;
    this.linearLayout = linearLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_menu1;
      ImageView ivMenu1 = ViewBindings.findChildViewById(rootView, id);
      if (ivMenu1 == null) {
        break missingId;
      }

      id = R.id.iv_menu2;
      ImageView ivMenu2 = ViewBindings.findChildViewById(rootView, id);
      if (ivMenu2 == null) {
        break missingId;
      }

      id = R.id.iv_menu3;
      ImageView ivMenu3 = ViewBindings.findChildViewById(rootView, id);
      if (ivMenu3 == null) {
        break missingId;
      }

      id = R.id.layoutFrame;
      FrameLayout layoutFrame = ViewBindings.findChildViewById(rootView, id);
      if (layoutFrame == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      return new ActivityHomeBinding((ConstraintLayout) rootView, ivMenu1, ivMenu2, ivMenu3,
          layoutFrame, linearLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
