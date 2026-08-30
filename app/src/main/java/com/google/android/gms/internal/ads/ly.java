package com.google.android.gms.internal.ads;
import a0.k;
import a0.m;
import fa.y;
import g3.a;
import g9.r;
import k9.a0;
import k9.b0;
import k9.f0;
import r.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.daren.scraply.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ly extends FrameLayout {
    public final iy A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public long F;
    public long G;
    public String H;
    public String[] I;
    public Bitmap J;
    public final ImageView K;
    public boolean L;

    /* renamed from: u, reason: collision with root package name */
    public final h00 f8179u;

    /* renamed from: v, reason: collision with root package name */
    public final FrameLayout f8180v;

    /* renamed from: w, reason: collision with root package name */
    public final View f8181w;

    /* renamed from: x, reason: collision with root package name */
    public final wl f8182x;

    /* renamed from: y, reason: collision with root package name */
    public final ky f8183y;

    /* renamed from: z, reason: collision with root package name */
    public final long f8184z;

    public ly(Context context, h00 h00Var, int i, boolean z3, wl wlVar, qy qyVar, be0 be0Var) {
        super(context);
        wl wlVar2;
        iy hyVar;
        iy iyVar;
        String str;
        this.f8179u = h00Var;
        this.f8182x = wlVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8180v = frameLayout;
        nl nlVar = sl.f10945t;
        g9.r rVar = g9.r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
            frameLayout.setBackgroundColor(-16777216);
        }
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        fa.y.h(h00Var.i());
        Object obj = h00Var.i().f18933v;
        ry ryVar = new ry(context, h00Var.A(), h00Var.m(), wlVar, h00Var.g());
        if (i == 3) {
            iyVar = new b00(context, ryVar);
            wlVar2 = wlVar;
        } else {
            if (i == 2) {
                h00Var.l0().getClass();
                hyVar = new vy(context, ryVar, h00Var, z3, qyVar, be0Var);
                wlVar2 = wlVar;
            } else {
                wlVar2 = wlVar;
                hyVar = new hy(context, h00Var, z3, h00Var.l0().b(), new ry(context, h00Var.A(), h00Var.m(), wlVar, h00Var.g()), be0Var);
            }
            iyVar = hyVar;
        }
        this.A = iyVar;
        View view = new View(context);
        this.f8181w = view;
        view.setBackgroundColor(0);
        frameLayout.addView(iyVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) qlVar2.a(sl.f10882p0)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) qlVar2.a(sl.m0)).booleanValue()) {
            a();
        }
        this.K = new ImageView(context);
        this.f8184z = ((Long) qlVar2.a(sl.f10916r0)).longValue();
        boolean booleanValue = ((Boolean) qlVar2.a(sl.f10865o0)).booleanValue();
        this.E = booleanValue;
        if (true != booleanValue) {
            str = "0";
        } else {
            str = "1";
        }
        wlVar2.c("spinner_used", str);
        this.f8183y = new ky(this);
        iyVar.e(this);
    }

    public final void a() {
        String string;
        iy iyVar = this.A;
        if (iyVar == null) {
            return;
        }
        TextView textView = new TextView(iyVar.getContext());
        Resources c10 = f9.k.C.f16817h.c();
        if (c10 == null) {
            string = "AdMob - ";
        } else {
            string = c10.getString(R.string.watermark_label_prefix);
        }
        textView.setText(String.valueOf(string).concat(iyVar.d()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.f8180v;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void b() {
        iy iyVar = this.A;
        if (iyVar != null) {
            long k3 = iyVar.k();
            if (this.F != k3 && k3 > 0) {
                float f10 = ((float) k3) / 1000.0f;
                if (((Boolean) g9.r.e.f17698c.a(sl.f11010x2)).booleanValue()) {
                    String valueOf = String.valueOf(f10);
                    String valueOf2 = String.valueOf(iyVar.r());
                    String valueOf3 = String.valueOf(iyVar.q());
                    String valueOf4 = String.valueOf(iyVar.p());
                    String valueOf5 = String.valueOf(iyVar.s());
                    f9.k.C.f16819k.getClass();
                    c("timeupdate", "time", valueOf, "totalBytes", valueOf2, "qoeCachedBytes", valueOf3, "qoeLoadedBytes", valueOf4, "droppedFrames", valueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
                } else {
                    c("timeupdate", "time", String.valueOf(f10));
                }
                this.F = k3;
            }
        }
    }

    public final void c(String str, String... strArr) {
        Integer num;
        HashMap hashMap = new HashMap();
        iy iyVar = this.A;
        if (iyVar != null) {
            num = iyVar.z();
        } else {
            num = null;
        }
        if (num != null) {
            hashMap.put("playerId", num.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f8179u.b("onVideoEvent", hashMap);
    }

    public final void d() {
        h00 h00Var = this.f8179u;
        if (h00Var.f() != null && this.C && !this.D) {
            h00Var.f().getWindow().clearFlags(128);
            this.C = false;
        }
    }

    public final void e() {
        iy iyVar = this.A;
        if (iyVar != null && this.G == 0) {
            c("canplaythrough", "duration", String.valueOf(iyVar.j() / 1000.0f), "videoWidth", String.valueOf(iyVar.n()), "videoHeight", String.valueOf(iyVar.o()));
        }
    }

    public final void f() {
        boolean z3 = false;
        if (((Boolean) g9.r.e.f17698c.a(sl.f11042z2)).booleanValue()) {
            ky kyVar = this.f8183y;
            kyVar.f7902w = false;
            k9.b0 b0Var = k9.f0.f19676l;
            b0Var.removeCallbacks(kyVar);
            b0Var.postDelayed(kyVar, 250L);
        }
        h00 h00Var = this.f8179u;
        if (h00Var.f() != null && !this.C) {
            if ((h00Var.f().getWindow().getAttributes().flags & 128) != 0) {
                z3 = true;
            }
            this.D = z3;
            if (!z3) {
                h00Var.f().getWindow().addFlags(128);
                this.C = true;
            }
        }
        this.B = true;
    }

    public final void finalize() {
        try {
            this.f8183y.a();
            iy iyVar = this.A;
            if (iyVar != null) {
                xx.f12655f.execute(new f(19, iyVar));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        c("pause", new String[0]);
        d();
        this.B = false;
    }

    public final void h() {
        if (((Boolean) g9.r.e.f17698c.a(sl.f11042z2)).booleanValue()) {
            this.f8183y.a();
        }
        c("ended", new String[0]);
        d();
    }

    public final void i() {
        if (this.L && this.J != null) {
            ImageView imageView = this.K;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.J);
                imageView.invalidate();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout = this.f8180v;
                frameLayout.addView(imageView, layoutParams);
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.f8183y.a();
        this.G = this.F;
        k9.f0.f19676l.post(new jy(this, 1));
    }

    public final void j(int i, int i10) {
        if (this.E) {
            nl nlVar = sl.f10899q0;
            g9.r rVar = g9.r.e;
            int max = Math.max(i / ((Integer) rVar.f17698c.a(nlVar)).intValue(), 1);
            int max2 = Math.max(i10 / ((Integer) rVar.f17698c.a(nlVar)).intValue(), 1);
            Bitmap bitmap = this.J;
            if (bitmap != null && bitmap.getWidth() == max && this.J.getHeight() == max2) {
                return;
            }
            this.J = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.L = false;
        }
    }

    public final void k() {
        this.f8181w.setVisibility(4);
        k9.f0.f19676l.post(new jy(this, 2));
    }

    public final void l(int i, int i10, int i11, int i12) {
        if (k9.a0.m()) {
            int length = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(i10).length() + 3 + String.valueOf(i11).length() + 3 + String.valueOf(i12).length());
            g3.a.r(i, i10, "Set video bounds to x:", ";y:", sb2);
            sb2.append(";w:");
            sb2.append(i11);
            sb2.append(";h:");
            sb2.append(i12);
            k9.a0.k(sb2.toString());
        }
        if (i11 != 0 && i12 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i12);
            layoutParams.setMargins(i, i10, 0, 0);
            this.f8180v.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        ky kyVar = this.f8183y;
        if (z3) {
            kyVar.f7902w = false;
            k9.b0 b0Var = k9.f0.f19676l;
            b0Var.removeCallbacks(kyVar);
            b0Var.postDelayed(kyVar, 250L);
        } else {
            kyVar.a();
            this.G = this.F;
        }
        k9.f0.f19676l.post(new ky(this, z3, 1));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z3 = false;
        ky kyVar = this.f8183y;
        if (i == 0) {
            kyVar.f7902w = false;
            k9.b0 b0Var = k9.f0.f19676l;
            b0Var.removeCallbacks(kyVar);
            b0Var.postDelayed(kyVar, 250L);
            z3 = true;
        } else {
            kyVar.a();
            this.G = this.F;
        }
        k9.f0.f19676l.post(new ky(this, z3, 0));
    }
}
