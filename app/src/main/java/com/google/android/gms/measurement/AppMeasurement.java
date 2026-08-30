package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import cb.a;
import cb.b;
import cb.c;
import com.google.android.gms.internal.measurement.a1;
import com.google.firebase.analytics.FirebaseAnalytics;
import eb.d1;
import eb.j2;
import eb.q1;
import fa.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f15566b;

    /* renamed from: a, reason: collision with root package name */
    public final a f15567a;

    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;
    }

    public AppMeasurement(d1 d1Var) {
        this.f15567a = new c(d1Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f15566b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f15566b == null) {
                        j2 j2Var = (j2) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                        if (j2Var != null) {
                            f15566b = new AppMeasurement(j2Var);
                        } else {
                            f15566b = new AppMeasurement(d1.a(context, new a1(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return f15566b;
    }

    public void beginAdUnitExposure(String str) {
        this.f15567a.t(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f15567a.f0(str, bundle, str2);
    }

    public void endAdUnitExposure(String str) {
        this.f15567a.C(str);
    }

    public long generateEventId() {
        return this.f15567a.b();
    }

    public String getAppInstanceId() {
        return this.f15567a.e();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty, java.lang.Object] */
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int size;
        List<Bundle> e02 = this.f15567a.e0(str, str2);
        if (e02 == null) {
            size = 0;
        } else {
            size = e02.size();
        }
        ArrayList arrayList = new ArrayList(size);
        for (Bundle bundle : e02) {
            Object obj = new Object();
            y.h(bundle);
            obj.mAppId = (String) q1.a(bundle, "app_id", String.class, null);
            obj.mOrigin = (String) q1.a(bundle, "origin", String.class, null);
            obj.mName = (String) q1.a(bundle, "name", String.class, null);
            obj.mValue = q1.a(bundle, "value", Object.class, null);
            obj.mTriggerEventName = (String) q1.a(bundle, "trigger_event_name", String.class, null);
            obj.mTriggerTimeout = ((Long) q1.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            obj.mTimedOutEventName = (String) q1.a(bundle, "timed_out_event_name", String.class, null);
            obj.mTimedOutEventParams = (Bundle) q1.a(bundle, "timed_out_event_params", Bundle.class, null);
            obj.mTriggeredEventName = (String) q1.a(bundle, "triggered_event_name", String.class, null);
            obj.mTriggeredEventParams = (Bundle) q1.a(bundle, "triggered_event_params", Bundle.class, null);
            obj.mTimeToLive = ((Long) q1.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            obj.mExpiredEventName = (String) q1.a(bundle, "expired_event_name", String.class, null);
            obj.mExpiredEventParams = (Bundle) q1.a(bundle, "expired_event_params", Bundle.class, null);
            obj.mActive = ((Boolean) q1.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.mCreationTimestamp = ((Long) q1.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            obj.mTriggeredTimestamp = ((Long) q1.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f15567a.d();
    }

    public String getCurrentScreenName() {
        return this.f15567a.g();
    }

    public String getGmpAppId() {
        return this.f15567a.f();
    }

    public int getMaxUserProperties(String str) {
        return this.f15567a.o(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z3) {
        return this.f15567a.g0(str, str2, z3);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f15567a.m0(str, bundle, str2);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        y.h(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            q1.e(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f15567a.k0(bundle);
    }

    public AppMeasurement(j2 j2Var) {
        this.f15567a = new b(j2Var);
    }
}