package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class y81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12811a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12812b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f12813c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f12814d;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.io.Serializable] */
    public y81(Class cls, int i) {
        this.f12811a = i;
        switch (i) {
            case 1:
                this.f12814d = new Object();
                this.f12812b = cls.getName();
                return;
            case 2:
                this.f12814d = new Object();
                this.f12812b = cls.getName();
                return;
            default:
                this.f12814d = new Object();
                this.f12812b = cls.getName();
                return;
        }
    }

    public final Logger a() {
        Logger logger;
        Logger logger2;
        Logger logger3;
        switch (this.f12811a) {
            case 0:
                Logger logger4 = this.f12813c;
                if (logger4 == null) {
                    synchronized (((v31) this.f12814d)) {
                        try {
                            logger = this.f12813c;
                            if (logger == null) {
                                logger = Logger.getLogger(this.f12812b);
                                this.f12813c = logger;
                            }
                        } finally {
                        }
                    }
                    return logger;
                }
                return logger4;
            case 1:
                Logger logger5 = this.f12813c;
                if (logger5 == null) {
                    synchronized (((com.google.android.gms.internal.mlkit_vision_digital_ink.c3) this.f12814d)) {
                        try {
                            logger2 = this.f12813c;
                            if (logger2 == null) {
                                logger2 = Logger.getLogger(this.f12812b);
                                this.f12813c = logger2;
                            }
                        } finally {
                        }
                    }
                    return logger2;
                }
                return logger5;
            default:
                Logger logger6 = this.f12813c;
                if (logger6 == null) {
                    synchronized (((com.google.android.gms.internal.play_billing.n) this.f12814d)) {
                        try {
                            logger3 = this.f12813c;
                            if (logger3 == null) {
                                logger3 = Logger.getLogger(this.f12812b);
                                this.f12813c = logger3;
                            }
                        } finally {
                        }
                    }
                    return logger3;
                }
                return logger6;
        }
    }
}
