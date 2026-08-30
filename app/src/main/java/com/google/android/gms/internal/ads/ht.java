package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;

/* loaded from: classes.dex */
public final class ht implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jt f6891b;

    public /* synthetic */ ht(jt jtVar, int i) {
        this.f6890a = i;
        this.f6891b = jtVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f6890a) {
            case 0:
                jt jtVar = this.f6891b;
                jtVar.getClass();
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", jtVar.A);
                data.putExtra("eventLocation", jtVar.E);
                data.putExtra("description", jtVar.D);
                long j10 = jtVar.B;
                if (j10 > -1) {
                    data.putExtra("beginTime", j10);
                }
                long j11 = jtVar.C;
                if (j11 > -1) {
                    data.putExtra("endTime", j11);
                }
                data.setFlags(268435456);
                k9.f0 f0Var = f9.k.C.f16813c;
                k9.f0.s(jtVar.f7535z, data);
                return;
            default:
                this.f6891b.n("Operation denied by user.");
                return;
        }
    }
}
