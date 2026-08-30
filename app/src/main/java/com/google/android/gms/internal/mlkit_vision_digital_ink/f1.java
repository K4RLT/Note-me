package com.google.android.gms.internal.mlkit_vision_digital_ink;
import de.k;
import fa.j;
import j6.n;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14290b;

    public /* synthetic */ f1(int i, Object obj) {
        this.f14289a = i;
        this.f14290b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14289a) {
            case 0:
                gw gwVar = (gw) this.f14290b;
                synchronized (((s0) gwVar.f14387w).f14950g) {
                    gwVar.f14386v = null;
                }
                return null;
            case 1:
                return fa.j.f16877c.a(((nl) this.f14290b).f14713g);
            case 2:
                return ((de.k) this.f14290b).a();
            case 3:
                j6.n nVar = ((sl) this.f14290b).f14976d;
                HashMap hashMap = (HashMap) nVar.f18941y;
                if (Log.isLoggable("DIRecoDownload", 4)) {
                    Log.i("DIRecoDownload", "DigitalInkRecognitionFileDependencyManager.initialize(): Parse Manifest");
                }
                boolean z3 = false;
                try {
                    nVar.f18940x = ((com.google.mlkit.vision.digitalink.common.downloading.a) nVar.f18939w).a();
                    if (Log.isLoggable("DIRecoDownload", 4)) {
                        Log.i("DIRecoDownload", "DigitalInkRecognitionFileDependencyManager.initialize(): Parse packmapping");
                    }
                    try {
                        InputStream open = ((Context) nVar.f18938v).getAssets().open("packmapping.pb");
                        try {
                            nn a10 = ((in) nv.t()).a(open, in.f14475b);
                            in.b(a10);
                            for (ev evVar : ((nv) a10).u()) {
                                hashMap.put(evVar.t(), evVar);
                            }
                            if (Log.isLoggable("DIRecoDownload", 4)) {
                                Log.i("DIRecoDownload", "DigitalInkRecognitionFileDependencyManager.initialize(): Read " + hashMap.size() + " pack mapping entries");
                            }
                            if (open != null) {
                                open.close();
                            }
                            z3 = true;
                        } finally {
                        }
                    } catch (IOException e) {
                        Log.e("DIRecoDownload", "DigitalInkRecognitionFileDependencyManager.initialize(): Error reading pack mapping.", e);
                    }
                } catch (IOException e8) {
                    Log.e("DIRecoDownload", "DigitalInkRecognitionFileDependencyManager.initialize(): Error parsing manifest.", e8);
                }
                return Boolean.valueOf(z3);
            default:
                ArrayList arrayList = (ArrayList) this.f14290b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ds dsVar = (ds) n5.r((ya) obj);
                    if (dsVar != ds.NONE && dsVar != ds.SUBSCRIBED) {
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
        }
    }
}
