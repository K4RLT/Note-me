package k9;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f19699u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f19700v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f19701w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f19702x;

    public i(j jVar, Context context, String str, boolean z3, boolean z9) {
        this.f19699u = context;
        this.f19700v = str;
        this.f19701w = z3;
        this.f19702x = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0 f0Var = f9.k.C.f16813c;
        Context context = this.f19699u;
        AlertDialog.Builder k3 = f0.k(context);
        k3.setMessage(this.f19700v);
        if (this.f19701w) {
            k3.setTitle("Error");
        } else {
            k3.setTitle("Info");
        }
        if (this.f19702x) {
            k3.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            k3.setPositiveButton("Learn More", new d(this, context));
            k3.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        k3.create().show();
    }
}
