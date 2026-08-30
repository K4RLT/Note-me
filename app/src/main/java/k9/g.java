package k9;
import a0.l;
import r.e;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.e00;
import com.google.android.gms.internal.ads.kf0;
import com.google.android.gms.internal.ads.nf0;
import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.ads.pu1;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.wx;
import com.google.android.gms.internal.ads.xx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19686a;

    /* renamed from: b, reason: collision with root package name */
    public final nf0 f19687b;

    /* renamed from: c, reason: collision with root package name */
    public String f19688c;

    /* renamed from: d, reason: collision with root package name */
    public String f19689d;
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public String f19690f;

    /* renamed from: h, reason: collision with root package name */
    public final int f19692h;
    public PointF i;

    /* renamed from: j, reason: collision with root package name */
    public PointF f19693j;

    /* renamed from: k, reason: collision with root package name */
    public final bb.a f19694k;

    /* renamed from: g, reason: collision with root package name */
    public int f19691g = 0;

    /* renamed from: l, reason: collision with root package name */
    public final c f19695l = new c(this, 6);

    public g(Context context) {
        this.f19686a = context;
        this.f19692h = ViewConfiguration.get(context).getScaledTouchSlop();
        f9.k kVar = f9.k.C;
        kVar.f16828t.a();
        this.f19694k = (bb.a) kVar.f16828t.f3159w;
        this.f19687b = kVar.f16823o.f19708g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z3) {
        if (!z3) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f19691g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f19691g;
        if (i != -1) {
            c cVar = this.f19695l;
            bb.a aVar = this.f19694k;
            if (i == 0) {
                if (actionMasked == 5) {
                    this.f19691g = 5;
                    this.f19693j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    aVar.postDelayed(cVar, ((Long) g9.e.f17698c.a(sl.R5)).longValue());
                    return;
                }
                return;
            }
            if (i == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z3 = false;
                        for (int i10 = 0; i10 < historySize; i10++) {
                            z3 |= !c(motionEvent.getHistoricalX(0, i10), motionEvent.getHistoricalY(0, i10), motionEvent.getHistoricalX(1, i10), motionEvent.getHistoricalY(1, i10));
                        }
                        if (c(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z3) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f19691g = -1;
                aVar.removeCallbacks(cVar);
            }
        }
    }

    public final void b() {
        String str;
        try {
            Context context = this.f19686a;
            if (!(context instanceof Activity)) {
                int i = a0.f19634b;
                l9.i.e("Can not create dialog without Activity Context");
                return;
            }
            f9.k kVar = f9.k.C;
            j jVar = kVar.f16823o;
            synchronized (jVar.f19703a) {
                str = jVar.f19705c;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = "Troubleshooting (enabled)";
            if (true != kVar.f16823o.h()) {
                str3 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            final int e = e(arrayList, "Ad information", true);
            final int e8 = e(arrayList, str2, true);
            final int e10 = e(arrayList, str3, true);
            boolean booleanValue = ((Boolean) g9.e.f17698c.a(sl.f11048za)).booleanValue();
            final int e11 = e(arrayList, "Open ad inspector", booleanValue);
            final int e12 = e(arrayList, "Ad inspector settings", booleanValue);
            AlertDialog.Builder k3 = f0.k(context);
            k3.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: k9.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    g gVar = g.this;
                    nf0 nf0Var = gVar.f19687b;
                    int i11 = 1;
                    if (i10 == e) {
                        Context context2 = gVar.f19686a;
                        if (!(context2 instanceof Activity)) {
                            int i12 = a0.f19634b;
                            l9.i.e("Can not create dialog without Activity Context");
                            return;
                        }
                        String str4 = gVar.f19688c;
                        String str5 = "No debug information";
                        if (!TextUtils.isEmpty(str4)) {
                            Uri build = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                            StringBuilder sb2 = new StringBuilder();
                            f0 f0Var = f9.k.C.f16813c;
                            HashMap o10 = f0.o(build);
                            for (String str6 : o10.keySet()) {
                                sb2.append(str6);
                                sb2.append(" = ");
                                sb2.append((String) o10.get(str6));
                                sb2.append("\n\n");
                            }
                            String trim = sb2.toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                str5 = trim;
                            }
                        }
                        f0 f0Var2 = f9.k.C.f16813c;
                        AlertDialog.Builder k4 = f0.k(context2);
                        k4.setMessage(str5);
                        k4.setTitle("Ad Information");
                        k4.setPositiveButton("Share", new e00(gVar, i11, str5));
                        k4.setNegativeButton("Close", f.f19675a);
                        k4.create().show();
                        return;
                    }
                    if (i10 == e8) {
                        int i13 = a0.f19634b;
                        l9.i.a("Debug mode [Creative Preview] selected.");
                        xx.f12651a.execute(new c(gVar, i11));
                        return;
                    }
                    if (i10 == e10) {
                        int i14 = a0.f19634b;
                        l9.i.a("Debug mode [Troubleshooting] selected.");
                        xx.f12651a.execute(new c(gVar, 2));
                        return;
                    }
                    if (i10 == e11) {
                        wx wxVar = xx.f12655f;
                        wx wxVar2 = xx.f12651a;
                        if (nf0Var.f()) {
                            wxVar.execute(new c(gVar, 5));
                            return;
                        } else {
                            wxVar2.execute(new ou1(gVar, 21, wxVar));
                            return;
                        }
                    }
                    if (i10 == e12) {
                        wx wxVar3 = xx.f12655f;
                        wx wxVar4 = xx.f12651a;
                        if (nf0Var.f()) {
                            wxVar3.execute(new c(gVar, 0));
                        } else {
                            wxVar4.execute(new pu1(gVar, 19, wxVar3));
                        }
                    }
                }
            });
            k3.create().show();
        } catch (WindowManager.BadTokenException e13) {
            l("", e13);
        }
    }

    public final boolean c(float f10, float f11, float f12, float f13) {
        float abs = Math.abs(this.i.x - f10);
        int i = this.f19692h;
        if (abs < i && Math.abs(this.i.y - f11) < i && Math.abs(this.f19693j.x - f12) < i && Math.abs(this.f19693j.y - f13) < i) {
            return true;
        }
        return false;
    }

    public final void d(Context context) {
        final int i;
        ArrayList arrayList = new ArrayList();
        int e = e(arrayList, "None", true);
        final int e8 = e(arrayList, "Shake", true);
        final int e10 = e(arrayList, "Flick", true);
        int ordinal = this.f19687b.f8703r.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                i = e;
            } else {
                i = e10;
            }
        } else {
            i = e8;
        }
        f0 f0Var = f9.k.C.f16813c;
        AlertDialog.Builder k3 = f0.k(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        k3.setTitle("Setup gesture");
        k3.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new d(0, atomicInteger));
        k3.setNegativeButton("Dismiss", new d(1, this));
        k3.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: k9.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                g gVar = g.this;
                nf0 nf0Var = gVar.f19687b;
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i) {
                    if (atomicInteger2.get() == e8) {
                        nf0Var.h(kf0.f7730v, true);
                    } else if (atomicInteger2.get() == e10) {
                        nf0Var.h(kf0.f7731w, true);
                    } else {
                        nf0Var.h(kf0.f7729u, true);
                    }
                }
                gVar.b();
            }
        });
        k3.setOnCancelListener(new f4.b(1, this));
        k3.create().show();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.f19688c);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f19690f);
        sb2.append(",AFMA Version: ");
        sb2.append(this.e);
        sb2.append(",Ad Unit ID: ");
        return a5.a.k(sb2, this.f19689d, "}");
    }
}
