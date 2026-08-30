package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.oh;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class s0 extends g0 implements p0 {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.measurement.p0, com.google.android.gms.internal.ads.oh] */
    public static p0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof p0) {
            return (p0) queryLocalInterface;
        }
        return new oh(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v37, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.measurement.g0
    public final boolean R(int i, Parcel parcel, Parcel parcel2) {
        boolean z3;
        boolean z9;
        boolean z10 = false;
        t0 t0Var = null;
        t0 t0Var2 = null;
        t0 t0Var3 = null;
        t0 t0Var4 = null;
        u0 u0Var = null;
        u0 u0Var2 = null;
        u0 u0Var3 = null;
        t0 t0Var5 = null;
        t0 t0Var6 = null;
        t0 t0Var7 = null;
        t0 t0Var8 = null;
        t0 t0Var9 = null;
        t0 t0Var10 = null;
        y0 y0Var = null;
        t0 t0Var11 = null;
        t0 t0Var12 = null;
        t0 t0Var13 = null;
        t0 t0Var14 = null;
        t0 t0Var15 = null;
        switch (i) {
            case 1:
                oa.a v12 = oa.b.v1(parcel.readStrongBinder());
                a1 a1Var = (a1) f0.a(parcel, a1.CREATOR);
                long readLong = parcel.readLong();
                f0.d(parcel);
                initialize(v12, a1Var, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) f0.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (parcel.readInt() != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                long readLong2 = parcel.readLong();
                f0.d(parcel);
                logEvent(readString, readString2, bundle, z3, z9, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) f0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof t0) {
                        t0Var = (t0) queryLocalInterface;
                    } else {
                        t0Var = new v0(readStrongBinder);
                    }
                }
                t0 t0Var16 = t0Var;
                long readLong3 = parcel.readLong();
                f0.d(parcel);
                logEventAndBundle(readString3, readString4, bundle2, t0Var16, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                oa.a v13 = oa.b.v1(parcel.readStrongBinder());
                ClassLoader classLoader = f0.f13745a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                long readLong4 = parcel.readLong();
                f0.d(parcel);
                setUserProperty(readString5, readString6, v13, z10, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = f0.f13745a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof t0) {
                        t0Var15 = (t0) queryLocalInterface2;
                    } else {
                        t0Var15 = new v0(readStrongBinder2);
                    }
                }
                f0.d(parcel);
                getUserProperties(readString7, readString8, z10, t0Var15);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof t0) {
                        t0Var14 = (t0) queryLocalInterface3;
                    } else {
                        t0Var14 = new v0(readStrongBinder3);
                    }
                }
                f0.d(parcel);
                getMaxUserProperties(readString9, t0Var14);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                f0.d(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) f0.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                f0.d(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) f0.a(parcel, Bundle.CREATOR);
                f0.d(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof t0) {
                        t0Var13 = (t0) queryLocalInterface4;
                    } else {
                        t0Var13 = new v0(readStrongBinder4);
                    }
                }
                f0.d(parcel);
                getConditionalUserProperties(readString13, readString14, t0Var13);
                break;
            case 11:
                ClassLoader classLoader3 = f0.f13745a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                long readLong7 = parcel.readLong();
                f0.d(parcel);
                setMeasurementEnabled(z10, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                f0.d(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                f0.d(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                f0.d(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                oa.a v14 = oa.b.v1(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                f0.d(parcel);
                setCurrentScreen(v14, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof t0) {
                        t0Var12 = (t0) queryLocalInterface5;
                    } else {
                        t0Var12 = new v0(readStrongBinder5);
                    }
                }
                f0.d(parcel);
                getCurrentScreenName(t0Var12);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof t0) {
                        t0Var11 = (t0) queryLocalInterface6;
                    } else {
                        t0Var11 = new v0(readStrongBinder6);
                    }
                }
                f0.d(parcel);
                getCurrentScreenClass(t0Var11);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof y0) {
                        y0Var = (y0) queryLocalInterface7;
                    } else {
                        y0Var = new oh(readStrongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 1);
                    }
                }
                f0.d(parcel);
                setInstanceIdProvider(y0Var);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof t0) {
                        t0Var10 = (t0) queryLocalInterface8;
                    } else {
                        t0Var10 = new v0(readStrongBinder8);
                    }
                }
                f0.d(parcel);
                getCachedAppInstanceId(t0Var10);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof t0) {
                        t0Var9 = (t0) queryLocalInterface9;
                    } else {
                        t0Var9 = new v0(readStrongBinder9);
                    }
                }
                f0.d(parcel);
                getAppInstanceId(t0Var9);
                break;
            case gl.zzm /* 21 */:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof t0) {
                        t0Var8 = (t0) queryLocalInterface10;
                    } else {
                        t0Var8 = new v0(readStrongBinder10);
                    }
                }
                f0.d(parcel);
                getGmpAppId(t0Var8);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof t0) {
                        t0Var7 = (t0) queryLocalInterface11;
                    } else {
                        t0Var7 = new v0(readStrongBinder11);
                    }
                }
                f0.d(parcel);
                generateEventId(t0Var7);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                f0.d(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                f0.d(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                oa.a v15 = oa.b.v1(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                f0.d(parcel);
                onActivityStarted(v15, readLong14);
                break;
            case 26:
                oa.a v16 = oa.b.v1(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                f0.d(parcel);
                onActivityStopped(v16, readLong15);
                break;
            case 27:
                oa.a v17 = oa.b.v1(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) f0.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                f0.d(parcel);
                onActivityCreated(v17, bundle5, readLong16);
                break;
            case 28:
                oa.a v18 = oa.b.v1(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                f0.d(parcel);
                onActivityDestroyed(v18, readLong17);
                break;
            case 29:
                oa.a v19 = oa.b.v1(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                f0.d(parcel);
                onActivityPaused(v19, readLong18);
                break;
            case 30:
                oa.a v110 = oa.b.v1(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                f0.d(parcel);
                onActivityResumed(v110, readLong19);
                break;
            case 31:
                oa.a v111 = oa.b.v1(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof t0) {
                        t0Var6 = (t0) queryLocalInterface12;
                    } else {
                        t0Var6 = new v0(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                f0.d(parcel);
                onActivitySaveInstanceState(v111, t0Var6, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) f0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof t0) {
                        t0Var5 = (t0) queryLocalInterface13;
                    } else {
                        t0Var5 = new v0(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                f0.d(parcel);
                performAction(bundle6, t0Var5, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                oa.a v112 = oa.b.v1(parcel.readStrongBinder());
                oa.a v113 = oa.b.v1(parcel.readStrongBinder());
                oa.a v114 = oa.b.v1(parcel.readStrongBinder());
                f0.d(parcel);
                logHealthData(readInt, readString19, v112, v113, v114);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof u0) {
                        u0Var3 = (u0) queryLocalInterface14;
                    } else {
                        u0Var3 = new w0(readStrongBinder14);
                    }
                }
                f0.d(parcel);
                setEventInterceptor(u0Var3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof u0) {
                        u0Var2 = (u0) queryLocalInterface15;
                    } else {
                        u0Var2 = new w0(readStrongBinder15);
                    }
                }
                f0.d(parcel);
                registerOnMeasurementEventListener(u0Var2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof u0) {
                        u0Var = (u0) queryLocalInterface16;
                    } else {
                        u0Var = new w0(readStrongBinder16);
                    }
                }
                f0.d(parcel);
                unregisterOnMeasurementEventListener(u0Var);
                break;
            case 37:
                HashMap readHashMap = parcel.readHashMap(f0.f13745a);
                f0.d(parcel);
                initForTests(readHashMap);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof t0) {
                        t0Var4 = (t0) queryLocalInterface17;
                    } else {
                        t0Var4 = new v0(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                f0.d(parcel);
                getTestFlag(t0Var4, readInt2);
                break;
            case 39:
                ClassLoader classLoader4 = f0.f13745a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                f0.d(parcel);
                setDataCollectionEnabled(z10);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof t0) {
                        t0Var3 = (t0) queryLocalInterface18;
                    } else {
                        t0Var3 = new v0(readStrongBinder18);
                    }
                }
                f0.d(parcel);
                isDataCollectionEnabled(t0Var3);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) f0.a(parcel, Bundle.CREATOR);
                f0.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long readLong22 = parcel.readLong();
                f0.d(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) f0.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                f0.d(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) f0.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                f0.d(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof t0) {
                        t0Var2 = (t0) queryLocalInterface19;
                    } else {
                        t0Var2 = new v0(readStrongBinder19);
                    }
                }
                f0.d(parcel);
                getSessionId(t0Var2);
                break;
            case 48:
                Intent intent = (Intent) f0.a(parcel, Intent.CREATOR);
                f0.d(parcel);
                setSgtmDebugInfo(intent);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
