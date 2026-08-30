package com.google.android.play.core.hsdp.service;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class HsdpLoadingPanelContainer extends FrameLayout {

    /* renamed from: u, reason: collision with root package name */
    public Runnable f15583u;

    public HsdpLoadingPanelContainer(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Runnable runnable = this.f15583u;
        if (runnable != null) {
            removeCallbacks(runnable);
            post(this.f15583u);
        }
    }

    public void setOnConfigurationChangedListener(Runnable runnable) {
        this.f15583u = runnable;
    }

    public HsdpLoadingPanelContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HsdpLoadingPanelContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public HsdpLoadingPanelContainer(Context context, AttributeSet attributeSet, int i, int i10) {
        super(context, attributeSet, i, i10);
    }
}
