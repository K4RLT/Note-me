package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.zip.InflaterInputStream;

/* loaded from: classes.dex */
public final class i0 implements h {

    /* renamed from: u, reason: collision with root package name */
    public boolean f14451u;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_digital_ink.i0] */
    public static i0 a() {
        ?? obj = new Object();
        obj.f14451u = false;
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InputStream d(g gVar) {
        e eVar;
        InputStream e = gVar.f14346b.e(gVar.f14349f);
        if (this.f14451u) {
            e = new BufferedInputStream(e);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(e);
        ArrayList arrayList2 = gVar.f14348d;
        if (!arrayList2.isEmpty()) {
            int i = e.f14228v;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                ((kx) obj).getClass();
            }
            if (!arrayList3.isEmpty()) {
                eVar = new e(e, arrayList3);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        e4 listIterator = gVar.f14347c.listIterator(0);
        while (listIterator.hasNext()) {
            arrayList.add(new InflaterInputStream((InputStream) gn.o(arrayList)));
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }
}
