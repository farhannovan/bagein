// Generated by view binder compiler. Do not edit!
package com.phyxel.bagein.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.phyxel.bagein.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDonasiPembayaranBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton btnBack;

  @NonNull
  public final Button btnDonasiBayar;

  @NonNull
  public final EditText etAmount;

  @NonNull
  public final LinearLayout lNominalLain;

  @NonNull
  public final TextView tNominal;

  @NonNull
  public final TextView tNominasiLain;

  @NonNull
  public final TextView textView33;

  @NonNull
  public final TextView textView34;

  @NonNull
  public final RelativeLayout titleBarAktivitasMisi;

  @NonNull
  public final TextView tv10k;

  @NonNull
  public final TextView tv20k;

  @NonNull
  public final TextView tv30k;

  @NonNull
  public final TextView tv40k;

  @NonNull
  public final TextView tv50k;

  @NonNull
  public final TextView tv60k;

  private ActivityDonasiPembayaranBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton btnBack, @NonNull Button btnDonasiBayar, @NonNull EditText etAmount,
      @NonNull LinearLayout lNominalLain, @NonNull TextView tNominal,
      @NonNull TextView tNominasiLain, @NonNull TextView textView33, @NonNull TextView textView34,
      @NonNull RelativeLayout titleBarAktivitasMisi, @NonNull TextView tv10k,
      @NonNull TextView tv20k, @NonNull TextView tv30k, @NonNull TextView tv40k,
      @NonNull TextView tv50k, @NonNull TextView tv60k) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnDonasiBayar = btnDonasiBayar;
    this.etAmount = etAmount;
    this.lNominalLain = lNominalLain;
    this.tNominal = tNominal;
    this.tNominasiLain = tNominasiLain;
    this.textView33 = textView33;
    this.textView34 = textView34;
    this.titleBarAktivitasMisi = titleBarAktivitasMisi;
    this.tv10k = tv10k;
    this.tv20k = tv20k;
    this.tv30k = tv30k;
    this.tv40k = tv40k;
    this.tv50k = tv50k;
    this.tv60k = tv60k;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDonasiPembayaranBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDonasiPembayaranBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_donasi_pembayaran, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDonasiPembayaranBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBack;
      ImageButton btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnDonasiBayar;
      Button btnDonasiBayar = ViewBindings.findChildViewById(rootView, id);
      if (btnDonasiBayar == null) {
        break missingId;
      }

      id = R.id.etAmount;
      EditText etAmount = ViewBindings.findChildViewById(rootView, id);
      if (etAmount == null) {
        break missingId;
      }

      id = R.id.lNominalLain;
      LinearLayout lNominalLain = ViewBindings.findChildViewById(rootView, id);
      if (lNominalLain == null) {
        break missingId;
      }

      id = R.id.tNominal;
      TextView tNominal = ViewBindings.findChildViewById(rootView, id);
      if (tNominal == null) {
        break missingId;
      }

      id = R.id.tNominasiLain;
      TextView tNominasiLain = ViewBindings.findChildViewById(rootView, id);
      if (tNominasiLain == null) {
        break missingId;
      }

      id = R.id.textView33;
      TextView textView33 = ViewBindings.findChildViewById(rootView, id);
      if (textView33 == null) {
        break missingId;
      }

      id = R.id.textView34;
      TextView textView34 = ViewBindings.findChildViewById(rootView, id);
      if (textView34 == null) {
        break missingId;
      }

      id = R.id.titleBarAktivitasMisi;
      RelativeLayout titleBarAktivitasMisi = ViewBindings.findChildViewById(rootView, id);
      if (titleBarAktivitasMisi == null) {
        break missingId;
      }

      id = R.id.tv10k;
      TextView tv10k = ViewBindings.findChildViewById(rootView, id);
      if (tv10k == null) {
        break missingId;
      }

      id = R.id.tv20k;
      TextView tv20k = ViewBindings.findChildViewById(rootView, id);
      if (tv20k == null) {
        break missingId;
      }

      id = R.id.tv30k;
      TextView tv30k = ViewBindings.findChildViewById(rootView, id);
      if (tv30k == null) {
        break missingId;
      }

      id = R.id.tv40k;
      TextView tv40k = ViewBindings.findChildViewById(rootView, id);
      if (tv40k == null) {
        break missingId;
      }

      id = R.id.tv50k;
      TextView tv50k = ViewBindings.findChildViewById(rootView, id);
      if (tv50k == null) {
        break missingId;
      }

      id = R.id.tv60k;
      TextView tv60k = ViewBindings.findChildViewById(rootView, id);
      if (tv60k == null) {
        break missingId;
      }

      return new ActivityDonasiPembayaranBinding((ConstraintLayout) rootView, btnBack,
          btnDonasiBayar, etAmount, lNominalLain, tNominal, tNominasiLain, textView33, textView34,
          titleBarAktivitasMisi, tv10k, tv20k, tv30k, tv40k, tv50k, tv60k);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
