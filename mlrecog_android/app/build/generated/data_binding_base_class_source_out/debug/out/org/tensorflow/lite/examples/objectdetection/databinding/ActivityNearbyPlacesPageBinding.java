// Generated by view binder compiler. Do not edit!
package org.tensorflow.lite.examples.objectdetection.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.tensorflow.lite.examples.objectdetection.R;

public final class ActivityNearbyPlacesPageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView card1;

  @NonNull
  public final CardView card2;

  @NonNull
  public final CardView card3;

  @NonNull
  public final CardView card4;

  @NonNull
  public final CardView card5;

  @NonNull
  public final CardView card6;

  @NonNull
  public final CardView card7;

  @NonNull
  public final TextView card7textview;

  @NonNull
  public final GridLayout cardGrid;

  @NonNull
  public final ConstraintLayout cardGridLayout;

  private ActivityNearbyPlacesPageBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView card1, @NonNull CardView card2, @NonNull CardView card3,
      @NonNull CardView card4, @NonNull CardView card5, @NonNull CardView card6,
      @NonNull CardView card7, @NonNull TextView card7textview, @NonNull GridLayout cardGrid,
      @NonNull ConstraintLayout cardGridLayout) {
    this.rootView = rootView;
    this.card1 = card1;
    this.card2 = card2;
    this.card3 = card3;
    this.card4 = card4;
    this.card5 = card5;
    this.card6 = card6;
    this.card7 = card7;
    this.card7textview = card7textview;
    this.cardGrid = cardGrid;
    this.cardGridLayout = cardGridLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNearbyPlacesPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNearbyPlacesPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_nearby_places_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNearbyPlacesPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card1;
      CardView card1 = ViewBindings.findChildViewById(rootView, id);
      if (card1 == null) {
        break missingId;
      }

      id = R.id.card2;
      CardView card2 = ViewBindings.findChildViewById(rootView, id);
      if (card2 == null) {
        break missingId;
      }

      id = R.id.card3;
      CardView card3 = ViewBindings.findChildViewById(rootView, id);
      if (card3 == null) {
        break missingId;
      }

      id = R.id.card4;
      CardView card4 = ViewBindings.findChildViewById(rootView, id);
      if (card4 == null) {
        break missingId;
      }

      id = R.id.card5;
      CardView card5 = ViewBindings.findChildViewById(rootView, id);
      if (card5 == null) {
        break missingId;
      }

      id = R.id.card6;
      CardView card6 = ViewBindings.findChildViewById(rootView, id);
      if (card6 == null) {
        break missingId;
      }

      id = R.id.card7;
      CardView card7 = ViewBindings.findChildViewById(rootView, id);
      if (card7 == null) {
        break missingId;
      }

      id = R.id.card7textview;
      TextView card7textview = ViewBindings.findChildViewById(rootView, id);
      if (card7textview == null) {
        break missingId;
      }

      id = R.id.cardGrid;
      GridLayout cardGrid = ViewBindings.findChildViewById(rootView, id);
      if (cardGrid == null) {
        break missingId;
      }

      ConstraintLayout cardGridLayout = (ConstraintLayout) rootView;

      return new ActivityNearbyPlacesPageBinding((ConstraintLayout) rootView, card1, card2, card3,
          card4, card5, card6, card7, card7textview, cardGrid, cardGridLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
