package com.google.mlkit.vision.digitalink.common.downloading;

import ab.b;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import xa.g0;
import xa.j2;
import xa.k2;
import xa.l2;
import xa.n2;
import xa.p0;
import xa.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15626a;

    /* renamed from: b, reason: collision with root package name */
    public final z f15627b;

    public a(Context context) {
        p0 p0Var = p0.f30494w;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = z.f30721f;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f15626a = context;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z3 = j2.f30437a;
        HashMap hashMap2 = new HashMap(hashMap);
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        this.f15627b = new z(p0Var, 5, hashMap2, arrayList3, 1, 2, new ArrayList(arrayDeque));
    }

    public final HashMap a() {
        DigitalInkManifestParser$Manifest digitalInkManifestParser$Manifest;
        List<DigitalInkManifestParser$Pack> list;
        InputStream open = this.f15626a.getAssets().open("manifest.json");
        if (Log.isLoggable("DIRecoDownload", 4)) {
            Log.i("DIRecoDownload", "DigitalInkManifestParser.parseManifest()");
        }
        HashMap hashMap = new HashMap();
        try {
            z zVar = this.f15627b;
            InputStreamReader inputStreamReader = new InputStreamReader(open);
            k2 k2Var = new k2(DigitalInkManifestParser$Manifest.class);
            l2 l2Var = new l2(inputStreamReader);
            l2Var.f30457v = 2;
            Object b10 = zVar.b(l2Var, k2Var);
            if (b10 != null) {
                try {
                    try {
                        if (l2Var.c0() != 10) {
                            throw new b("JSON document was not fully consumed.", 21);
                        }
                    } catch (n2 e) {
                        throw new b(21, e);
                    }
                } catch (IOException e8) {
                    throw new b(21, e8);
                }
            }
            digitalInkManifestParser$Manifest = (DigitalInkManifestParser$Manifest) b10;
        } catch (g0 e10) {
            Log.e("DIRecoDownload", "Failed parsing manifest:", e10);
            digitalInkManifestParser$Manifest = null;
        }
        if (digitalInkManifestParser$Manifest != null && (list = digitalInkManifestParser$Manifest.packs) != null) {
            for (DigitalInkManifestParser$Pack digitalInkManifestParser$Pack : list) {
                if (digitalInkManifestParser$Pack.isValid()) {
                    hashMap.put(digitalInkManifestParser$Pack.getName(), digitalInkManifestParser$Pack);
                } else {
                    Log.e("DIRecoDownload", "Skip invalid pack.");
                }
            }
        }
        if (Log.isLoggable("DIRecoDownload", 4)) {
            Log.i("DIRecoDownload", "DigitalInkManifestParser.parseManifestFromAsset(): read " + hashMap.size() + " manifest entries");
        }
        return hashMap;
    }
}
