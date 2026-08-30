package com.google.android.gms.internal.ads;
import d9.b;
import l9.f;
import b.b;
import c1.a;
import ca.g;
import f9.f;
import f9.k;
import ic.c;
import j9.d;
import k9.a0;
import k9.f0;
import l9.i;
import s6.q;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class nx extends c1.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8886w = 2;

    /* renamed from: x, reason: collision with root package name */
    public final Object f8887x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(px pxVar) {
        super(3);
        Objects.requireNonNull(pxVar);
        this.f8887x = pxVar;
    }

    @Override // c1.a
    public final void q() {
        BitmapDrawable bitmapDrawable;
        boolean z3 = false;
        switch (this.f8886w) {
            case 0:
                px pxVar = (px) this.f8887x;
                tw twVar = new tw(pxVar.e, pxVar.f9636f.f20029u);
                synchronized (pxVar.f9632a) {
                    try {
                        s6 s6Var = f9.k.C.f16821m;
                        s6.q(pxVar.f9638h, twVar);
                    } catch (IllegalArgumentException e) {
                        int i = k9.a0.f19634b;
                        l9.i.g("Cannot config CSI reporter.", e);
                    }
                }
                return;
            case 1:
                j9.d dVar = (j9.d) this.f8887x;
                ic.c cVar = f9.k.C.f16831w;
                Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) cVar.f18393v).get(Integer.valueOf(dVar.f19065w.I.f16803z));
                if (bitmap != null) {
                    f9.f fVar = dVar.f19065w.I;
                    boolean z9 = fVar.f16801x;
                    float f10 = fVar.f16802y;
                    Activity activity = dVar.f19064v;
                    if (z9 && f10 > 0.0f && f10 <= 25.0f) {
                        try {
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                            RenderScript create = RenderScript.create(activity);
                            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                            create2.setRadius(f10);
                            create2.setInput(createFromBitmap);
                            create2.forEach(createFromBitmap2);
                            createFromBitmap2.copyTo(createBitmap);
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                        } catch (RuntimeException unused) {
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                        }
                    } else {
                        bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    }
                    k9.f0.f19676l.post(new iv1(this, 18, bitmapDrawable));
                    return;
                }
                return;
            default:
                try {
                    z3 = d9.b.b((Context) this.f8887x);
                } catch (ca.g | IOException | IllegalStateException e8) {
                    int i10 = k9.a0.f19634b;
                    l9.i.d("Fail to get isAdIdFakeForDebugLogging", e8);
                }
                synchronized (l9.f.f20042b) {
                    l9.f.f20043c = true;
                    l9.f.f20044d = z3;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(z3).length() + 38);
                sb2.append("Update ad debug logging enablement as ");
                sb2.append(z3);
                String sb3 = sb2.toString();
                int i11 = k9.a0.f19634b;
                l9.i.f(sb3);
                return;
        }
    }

    public nx(Context context) {
        super(3);
        this.f8887x = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nx(j9.d dVar) {
        super(3);
        this.f8887x = dVar;
    }
}
