package j9;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/* loaded from: classes.dex */
public final class o extends FrameLayout implements View.OnClickListener {

    /* renamed from: u, reason: collision with root package name */
    public final ImageButton f19091u;

    /* renamed from: v, reason: collision with root package name */
    public final d f19092v;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(android.content.Context r7, com.google.android.gms.internal.ads.sl0 r8, j9.d r9) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.o.<init>(android.content.Context, com.google.android.gms.internal.ads.sl0, j9.d):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d dVar = this.f19092v;
        if (dVar != null) {
            dVar.R = 2;
            dVar.f19064v.finish();
        }
    }
}
