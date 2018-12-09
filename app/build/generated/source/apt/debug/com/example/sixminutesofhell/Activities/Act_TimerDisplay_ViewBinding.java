// Generated code from Butter Knife. Do not modify!
package com.example.sixminutesofhell.Activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.sixminutesofhell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Act_TimerDisplay_ViewBinding implements Unbinder {
  private Act_TimerDisplay target;

  private View view2131230758;

  private View view2131230760;

  private View view2131230759;

  private View view2131230800;

  @UiThread
  public Act_TimerDisplay_ViewBinding(Act_TimerDisplay target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Act_TimerDisplay_ViewBinding(final Act_TimerDisplay target, View source) {
    this.target = target;

    View view;
    target.exerciseDisplay = Utils.findRequiredViewAsType(source, R.id.exercise_display, "field 'exerciseDisplay'", TextView.class);
    target.nextExerciseDisplay = Utils.findRequiredViewAsType(source, R.id.next_exercise_display, "field 'nextExerciseDisplay'", TextView.class);
    target.timerDisplay = Utils.findRequiredViewAsType(source, R.id.time_remaining, "field 'timerDisplay'", TextView.class);
    target.layout = Utils.findRequiredViewAsType(source, R.id.timer_layout, "field 'layout'", ConstraintLayout.class);
    view = Utils.findRequiredView(source, R.id.button_start_timer, "field 'btnStartTimer' and method 'onStartTimer'");
    target.btnStartTimer = Utils.castView(view, R.id.button_start_timer, "field 'btnStartTimer'", Button.class);
    view2131230758 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onStartTimer();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_unit_skip, "field 'btnUnitSkip' and method 'onButtonSkipUnit'");
    target.btnUnitSkip = Utils.castView(view, R.id.button_unit_skip, "field 'btnUnitSkip'", Button.class);
    view2131230760 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onButtonSkipUnit();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_unit_back, "field 'btnUnitBack' and method 'onButtonBack'");
    target.btnUnitBack = Utils.castView(view, R.id.button_unit_back, "field 'btnUnitBack'", Button.class);
    view2131230759 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onButtonBack();
      }
    });
    view = Utils.findRequiredView(source, R.id.fab_home, "field 'fabHome' and method 'onFabHome'");
    target.fabHome = Utils.castView(view, R.id.fab_home, "field 'fabHome'", FloatingActionButton.class);
    view2131230800 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFabHome();
      }
    });
    target.imageInfo = Utils.findRequiredViewAsType(source, R.id.image_info, "field 'imageInfo'", ImageView.class);
    target.exerciseImage = Utils.findRequiredViewAsType(source, R.id.exercise_image, "field 'exerciseImage'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Act_TimerDisplay target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.exerciseDisplay = null;
    target.nextExerciseDisplay = null;
    target.timerDisplay = null;
    target.layout = null;
    target.btnStartTimer = null;
    target.btnUnitSkip = null;
    target.btnUnitBack = null;
    target.fabHome = null;
    target.imageInfo = null;
    target.exerciseImage = null;

    view2131230758.setOnClickListener(null);
    view2131230758 = null;
    view2131230760.setOnClickListener(null);
    view2131230760 = null;
    view2131230759.setOnClickListener(null);
    view2131230759 = null;
    view2131230800.setOnClickListener(null);
    view2131230800 = null;
  }
}
