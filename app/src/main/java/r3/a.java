package r3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: u, reason: collision with root package name */
    public final int f24525u;

    /* renamed from: v, reason: collision with root package name */
    public final e f24526v;

    /* renamed from: w, reason: collision with root package name */
    public final int f24527w;

    public a(int i, e eVar, int i10) {
        this.f24525u = i;
        this.f24526v = eVar;
        this.f24527w = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f24525u);
        this.f24526v.f24537a.performAction(this.f24527w, bundle);
    }
}
