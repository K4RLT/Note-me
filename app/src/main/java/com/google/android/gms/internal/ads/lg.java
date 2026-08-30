package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class lg extends wg {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8024h = 1;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f8025j;

    public lg(dg dgVar, wd wdVar, int i, Context context) {
        super(dgVar, "XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", wdVar, i, 31);
        this.i = null;
        this.f8025j = context;
    }

    @Override // com.google.android.gms.internal.ads.wg
    public final void a() {
        switch (this.f8024h) {
            case 0:
                View view = (View) this.f8025j;
                if (view != null) {
                    Boolean bool = (Boolean) g9.r.e.f17698c.a(sl.f10964u3);
                    boolean booleanValue = bool.booleanValue();
                    Object[] objArr = (Object[]) this.e.invoke(null, view, (Activity) this.i, bool);
                    wd wdVar = this.f12235d;
                    synchronized (wdVar) {
                        try {
                            long longValue = ((Long) objArr[0]).longValue();
                            wdVar.b();
                            ((je) wdVar.f4845v).c0(longValue);
                            long longValue2 = ((Long) objArr[1]).longValue();
                            wdVar.b();
                            ((je) wdVar.f4845v).d0(longValue2);
                            if (booleanValue) {
                                String str = (String) objArr[2];
                                wdVar.b();
                                ((je) wdVar.f4845v).e0(str);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                wd wdVar2 = this.f12235d;
                wdVar2.b();
                ((je) wdVar2.f4845v).A(-1L);
                wdVar2.b();
                ((je) wdVar2.f4845v).B(-1L);
                Context context = (Context) this.f8025j;
                if (context == null) {
                    context = this.f12232a.f5418a;
                }
                if (((List) this.i) == null) {
                    this.i = (List) this.e.invoke(null, context);
                }
                List list = (List) this.i;
                if (list != null && list.size() == 2) {
                    synchronized (wdVar2) {
                        long longValue3 = ((Long) ((List) this.i).get(0)).longValue();
                        wdVar2.b();
                        ((je) wdVar2.f4845v).A(longValue3);
                        long longValue4 = ((Long) ((List) this.i).get(1)).longValue();
                        wdVar2.b();
                        ((je) wdVar2.f4845v).B(longValue4);
                    }
                    return;
                }
                return;
        }
    }

    public lg(dg dgVar, wd wdVar, int i, View view, Activity activity) {
        super(dgVar, "9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", wdVar, i, 62);
        this.f8025j = view;
        this.i = activity;
    }
}
