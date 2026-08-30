package com.google.mlkit.vision.digitalink.recognition.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_digital_ink.i;
import com.google.android.gms.internal.mlkit_vision_digital_ink.i2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.jm;
import com.google.android.gms.internal.mlkit_vision_digital_ink.y2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.zb;
import com.google.mlkit.vision.digitalink.common.RecognitionCandidate;
import de.f;
import de.h;
import fa.o;
import fa.y;
import j6.e;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import je.b;
import ke.a;
import le.c;
import le.d;
import le.g;
import q.x;
import wa.h8;

/* loaded from: classes.dex */
public class DigitalInkRecognizerJni extends h {

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f15628d = new AtomicLong();
    public final b e;

    /* renamed from: f, reason: collision with root package name */
    public final a f15629f;

    /* renamed from: g, reason: collision with root package name */
    public final d f15630g;

    /* renamed from: h, reason: collision with root package name */
    public final c f15631h;
    public final e i;

    static {
        je.c cVar = je.c.f19174d;
        int i = b.f19172d;
        if (cVar != null) {
            new b(cVar);
            try {
                System.loadLibrary("digitalink");
                return;
            } catch (UnsatisfiedLinkError e) {
                Log.e("DIRecoJni", "Native library loading failed: ".concat(e.toString()));
                return;
            }
        }
        x.n("No model identifier set for model");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j6.e, java.lang.Object] */
    public DigitalInkRecognizerJni(b bVar, a aVar, d dVar) {
        this.e = bVar;
        this.f15629f = aVar;
        this.f15630g = dVar;
        Context b10 = f.c().b();
        Object obj = new Object();
        obj.f18919v = new AtomicLong(-1L);
        obj.f18918u = new da.f(b10, ha.b.C, new o("mlkit:vision"), da.e.f15820b);
        this.i = obj;
        c cVar = new c(dVar, 315);
        cVar.f(zb.RECOGNITION_SUCCESS);
        cVar.e = 30L;
        cVar.d(bVar);
        this.f15631h = cVar;
    }

    public native RecognitionCandidate[] callNativeRecognizer(long j10, float[][][] fArr, float f10, float f11, String str, int i, boolean z3);

    @Override // de.h
    public final void d() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zb zbVar = zb.RECOGNIZER_INITIALIZE_IO_EXCEPTION;
        AtomicLong atomicLong = this.f15628d;
        if (atomicLong.get() != 0) {
            return;
        }
        y2 b10 = y2.b(i2.f14454a);
        c cVar = new c(this.f15630g, 313);
        b bVar = this.e;
        cVar.d(bVar);
        try {
            try {
                a aVar = this.f15629f;
                y.h(aVar);
                ke.b bVar2 = (ke.b) h8.a(aVar.e(bVar));
                try {
                    FileInputStream a10 = bVar2.a();
                    try {
                        i iVar = bVar2.f19771a;
                        Object c10 = iVar.c(bVar2.f19773c, new jm(8));
                        y.h(c10);
                        FileInputStream createInputStream = ((AssetFileDescriptor) c10).createInputStream();
                        try {
                            Uri uri = bVar2.f19774d;
                            Uri uri2 = Uri.EMPTY;
                            Object obj = null;
                            FileInputStream createInputStream2 = null;
                            if (!uri.equals(uri2)) {
                                jm jmVar = new jm(8);
                                if (!uri.equals(uri2)) {
                                    obj = iVar.c(uri, jmVar);
                                    y.h(obj);
                                }
                                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                                y.h(assetFileDescriptor);
                                createInputStream2 = assetFileDescriptor.createInputStream();
                            }
                            try {
                                atomicLong.set(initNativeRecognizer(a10, createInputStream, createInputStream2));
                                cVar.f(zb.RECOGNIZER_INITIALIZE_SUCCESS);
                                if (createInputStream2 != null) {
                                    createInputStream2.close();
                                }
                                if (createInputStream != null) {
                                    createInputStream.close();
                                }
                                if (a10 != null) {
                                    a10.close();
                                }
                                cVar.c(b10.a(timeUnit));
                                cVar.g();
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (a10 != null) {
                            try {
                                a10.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    cVar.f(zbVar);
                    throw new zd.a("Exception occurred reading model files from storage.", e);
                } catch (g e8) {
                    cVar.f(zb.RECOGNIZER_INITIALIZE_NATIVE_HANDWRITING_EXCEPTION);
                    cVar.e(e8);
                    throw new zd.a("An internal error occurred during initialization.", e8);
                } catch (Throwable th3) {
                    if (!(th3 instanceof InternalError)) {
                        if (th3 instanceof RuntimeException) {
                            cVar.f(zb.RECOGNIZER_INITIALIZE_RUNTIME_EXCEPTION);
                        } else {
                            cVar.f(zb.RECOGNIZER_INITIALIZE_UNKNOWN_EXCEPTION);
                        }
                    } else {
                        cVar.f(zb.RECOGNIZER_INITIALIZE_INTERNAL_ERROR);
                    }
                    throw new zd.a("An internal error occurred during initialization.", th3);
                }
            } catch (InterruptedException e10) {
                cVar.f(zbVar);
                throw new zd.a("An internal error occurred during initialization.", e10);
            } catch (ExecutionException e11) {
                cVar.f(zbVar);
                throw new zd.a("An internal error occurred during initialization.", e11.getCause());
            }
        } catch (Throwable th4) {
            cVar.c(b10.a(timeUnit));
            cVar.g();
            throw th4;
        }
    }

    public native void deinitNativeRecognizer(long j10);

    @Override // de.h
    public final void e() {
        this.f15631h.b();
        long andSet = this.f15628d.getAndSet(0L);
        if (andSet != 0) {
            deinitNativeRecognizer(andSet);
        }
    }

    public native long initNativeRecognizer(FileInputStream fileInputStream, FileInputStream fileInputStream2, FileInputStream fileInputStream3);
}