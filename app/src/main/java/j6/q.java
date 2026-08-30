package j6;
import g.a;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g5.a0;
import java.util.ArrayList;
import wa.z8;
import ya.b0;
import ya.c0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f18965a;

    /* renamed from: b, reason: collision with root package name */
    public final b f18966b;

    /* renamed from: c, reason: collision with root package name */
    public final h f18967c;

    /* renamed from: d, reason: collision with root package name */
    public final h f18968d;
    public final h e;

    /* renamed from: f, reason: collision with root package name */
    public final h f18969f;

    /* renamed from: g, reason: collision with root package name */
    public final h f18970g;

    /* renamed from: h, reason: collision with root package name */
    public final h f18971h;
    public final h i;

    /* renamed from: j, reason: collision with root package name */
    public final h f18972j;

    /* renamed from: k, reason: collision with root package name */
    public final h f18973k;

    /* renamed from: l, reason: collision with root package name */
    public final h f18974l;

    /* renamed from: m, reason: collision with root package name */
    public final h f18975m;

    /* renamed from: n, reason: collision with root package name */
    public final h f18976n;

    public q(WorkDatabase_Impl workDatabase_Impl) {
        this.f18965a = workDatabase_Impl;
        this.f18966b = new b(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 12);
        this.f18967c = new h(workDatabase_Impl, 13);
        this.f18968d = new h(workDatabase_Impl, 14);
        this.e = new h(workDatabase_Impl, 15);
        this.f18969f = new h(workDatabase_Impl, 16);
        this.f18970g = new h(workDatabase_Impl, 17);
        this.f18971h = new h(workDatabase_Impl, 18);
        this.i = new h(workDatabase_Impl, 19);
        this.f18972j = new h(workDatabase_Impl, 4);
        new h(workDatabase_Impl, 5);
        this.f18973k = new h(workDatabase_Impl, 6);
        this.f18974l = new h(workDatabase_Impl, 7);
        this.f18975m = new h(workDatabase_Impl, 8);
        new h(workDatabase_Impl, 9);
        new h(workDatabase_Impl, 10);
        this.f18976n = new h(workDatabase_Impl, 11);
    }

    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        h hVar = this.f18967c;
        r5.j a10 = hVar.a();
        if (str == null) {
            a10.g(1);
        } else {
            a10.n(1, str);
        }
        workDatabase_Impl.c();
        try {
            a10.f();
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.h();
            hVar.f(a10);
        }
    }

    public final ArrayList b() {
        a0 a0Var;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        a0 k3 = a0.k(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        k3.b(1, 200);
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        Cursor d2 = c0.d(workDatabase_Impl, k3, false);
        try {
            int a10 = b0.a(d2, FacebookMediationAdapter.KEY_ID);
            int a11 = b0.a(d2, "state");
            int a12 = b0.a(d2, "worker_class_name");
            int a13 = b0.a(d2, "input_merger_class_name");
            int a14 = b0.a(d2, "input");
            int a15 = b0.a(d2, "output");
            int a16 = b0.a(d2, "initial_delay");
            int a17 = b0.a(d2, "interval_duration");
            int a18 = b0.a(d2, "flex_duration");
            int a19 = b0.a(d2, "run_attempt_count");
            int a20 = b0.a(d2, "backoff_policy");
            int a21 = b0.a(d2, "backoff_delay_duration");
            int a22 = b0.a(d2, "last_enqueue_time");
            a0Var = k3;
            try {
                int a23 = b0.a(d2, "minimum_retention_duration");
                int a24 = b0.a(d2, "schedule_requested_at");
                int a25 = b0.a(d2, "run_in_foreground");
                int a26 = b0.a(d2, "out_of_quota_policy");
                int a27 = b0.a(d2, "period_count");
                int a28 = b0.a(d2, "generation");
                int a29 = b0.a(d2, "next_schedule_time_override");
                int a30 = b0.a(d2, "next_schedule_time_override_generation");
                int a31 = b0.a(d2, "stop_reason");
                int a32 = b0.a(d2, "required_network_type");
                int a33 = b0.a(d2, "requires_charging");
                int a34 = b0.a(d2, "requires_device_idle");
                int a35 = b0.a(d2, "requires_battery_not_low");
                int a36 = b0.a(d2, "requires_storage_not_low");
                int a37 = b0.a(d2, "trigger_content_update_delay");
                int a38 = b0.a(d2, "trigger_max_content_delay");
                int a39 = b0.a(d2, "content_uri_triggers");
                int i = a23;
                ArrayList arrayList = new ArrayList(d2.getCount());
                while (d2.moveToNext()) {
                    byte[] bArr = null;
                    if (d2.isNull(a10)) {
                        string = null;
                    } else {
                        string = d2.getString(a10);
                    }
                    int e = z8.e(d2.getInt(a11));
                    if (d2.isNull(a12)) {
                        string2 = null;
                    } else {
                        string2 = d2.getString(a12);
                    }
                    if (d2.isNull(a13)) {
                        string3 = null;
                    } else {
                        string3 = d2.getString(a13);
                    }
                    if (d2.isNull(a14)) {
                        blob = null;
                    } else {
                        blob = d2.getBlob(a14);
                    }
                    a6.g a40 = a6.a(blob);
                    if (d2.isNull(a15)) {
                        blob2 = null;
                    } else {
                        blob2 = d2.getBlob(a15);
                    }
                    a6.g a41 = a6.a(blob2);
                    long j10 = d2.getLong(a16);
                    long j11 = d2.getLong(a17);
                    long j12 = d2.getLong(a18);
                    int i10 = d2.getInt(a19);
                    int b10 = z8.b(d2.getInt(a20));
                    long j13 = d2.getLong(a21);
                    long j14 = d2.getLong(a22);
                    int i11 = i;
                    long j15 = d2.getLong(i11);
                    int i12 = a21;
                    int i13 = a24;
                    long j16 = d2.getLong(i13);
                    a24 = i13;
                    int i14 = a25;
                    if (d2.getInt(i14) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    a25 = i14;
                    int i15 = a26;
                    int d10 = z8.d(d2.getInt(i15));
                    a26 = i15;
                    int i16 = a27;
                    int i17 = d2.getInt(i16);
                    a27 = i16;
                    int i18 = a28;
                    int i19 = d2.getInt(i18);
                    a28 = i18;
                    int i20 = a29;
                    long j17 = d2.getLong(i20);
                    a29 = i20;
                    int i21 = a30;
                    int i22 = d2.getInt(i21);
                    a30 = i21;
                    int i23 = a31;
                    int i24 = d2.getInt(i23);
                    a31 = i23;
                    int i25 = a32;
                    int c10 = z8.c(d2.getInt(i25));
                    a32 = i25;
                    int i26 = a33;
                    if (d2.getInt(i26) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    a33 = i26;
                    int i27 = a34;
                    if (d2.getInt(i27) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a34 = i27;
                    int i28 = a35;
                    if (d2.getInt(i28) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a35 = i28;
                    int i29 = a36;
                    if (d2.getInt(i29) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    a36 = i29;
                    int i30 = a37;
                    long j18 = d2.getLong(i30);
                    a37 = i30;
                    int i31 = a38;
                    long j19 = d2.getLong(i31);
                    a38 = i31;
                    int i32 = a39;
                    if (!d2.isNull(i32)) {
                        bArr = d2.getBlob(i32);
                    }
                    a39 = i32;
                    arrayList.add(new p(string, e, string2, string3, a40, a41, j10, j11, j12, new a6.d(c10, z9, z10, z11, z12, j18, j19, z8.a(bArr)), i10, b10, j13, j14, j15, j16, z3, d10, i17, i19, j17, i22, i24));
                    a21 = i12;
                    i = i11;
                }
                d2.close();
                a0Var.m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                d2.close();
                a0Var.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            a0Var = k3;
        }
    }

    public final ArrayList c(int i) {
        a0 a0Var;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        a0 k3 = a0.k(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        k3.b(1, i);
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        Cursor d2 = c0.d(workDatabase_Impl, k3, false);
        try {
            int a10 = b0.a(d2, FacebookMediationAdapter.KEY_ID);
            int a11 = b0.a(d2, "state");
            int a12 = b0.a(d2, "worker_class_name");
            int a13 = b0.a(d2, "input_merger_class_name");
            int a14 = b0.a(d2, "input");
            int a15 = b0.a(d2, "output");
            int a16 = b0.a(d2, "initial_delay");
            int a17 = b0.a(d2, "interval_duration");
            int a18 = b0.a(d2, "flex_duration");
            int a19 = b0.a(d2, "run_attempt_count");
            int a20 = b0.a(d2, "backoff_policy");
            int a21 = b0.a(d2, "backoff_delay_duration");
            int a22 = b0.a(d2, "last_enqueue_time");
            a0Var = k3;
            try {
                int a23 = b0.a(d2, "minimum_retention_duration");
                int a24 = b0.a(d2, "schedule_requested_at");
                int a25 = b0.a(d2, "run_in_foreground");
                int a26 = b0.a(d2, "out_of_quota_policy");
                int a27 = b0.a(d2, "period_count");
                int a28 = b0.a(d2, "generation");
                int a29 = b0.a(d2, "next_schedule_time_override");
                int a30 = b0.a(d2, "next_schedule_time_override_generation");
                int a31 = b0.a(d2, "stop_reason");
                int a32 = b0.a(d2, "required_network_type");
                int a33 = b0.a(d2, "requires_charging");
                int a34 = b0.a(d2, "requires_device_idle");
                int a35 = b0.a(d2, "requires_battery_not_low");
                int a36 = b0.a(d2, "requires_storage_not_low");
                int a37 = b0.a(d2, "trigger_content_update_delay");
                int a38 = b0.a(d2, "trigger_max_content_delay");
                int a39 = b0.a(d2, "content_uri_triggers");
                int i10 = a23;
                ArrayList arrayList = new ArrayList(d2.getCount());
                while (d2.moveToNext()) {
                    byte[] bArr = null;
                    if (d2.isNull(a10)) {
                        string = null;
                    } else {
                        string = d2.getString(a10);
                    }
                    int e = z8.e(d2.getInt(a11));
                    if (d2.isNull(a12)) {
                        string2 = null;
                    } else {
                        string2 = d2.getString(a12);
                    }
                    if (d2.isNull(a13)) {
                        string3 = null;
                    } else {
                        string3 = d2.getString(a13);
                    }
                    if (d2.isNull(a14)) {
                        blob = null;
                    } else {
                        blob = d2.getBlob(a14);
                    }
                    a6.g a40 = a6.a(blob);
                    if (d2.isNull(a15)) {
                        blob2 = null;
                    } else {
                        blob2 = d2.getBlob(a15);
                    }
                    a6.g a41 = a6.a(blob2);
                    long j10 = d2.getLong(a16);
                    long j11 = d2.getLong(a17);
                    long j12 = d2.getLong(a18);
                    int i11 = d2.getInt(a19);
                    int b10 = z8.b(d2.getInt(a20));
                    long j13 = d2.getLong(a21);
                    long j14 = d2.getLong(a22);
                    int i12 = i10;
                    long j15 = d2.getLong(i12);
                    int i13 = a21;
                    int i14 = a24;
                    long j16 = d2.getLong(i14);
                    a24 = i14;
                    int i15 = a25;
                    if (d2.getInt(i15) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    a25 = i15;
                    int i16 = a26;
                    int d10 = z8.d(d2.getInt(i16));
                    a26 = i16;
                    int i17 = a27;
                    int i18 = d2.getInt(i17);
                    a27 = i17;
                    int i19 = a28;
                    int i20 = d2.getInt(i19);
                    a28 = i19;
                    int i21 = a29;
                    long j17 = d2.getLong(i21);
                    a29 = i21;
                    int i22 = a30;
                    int i23 = d2.getInt(i22);
                    a30 = i22;
                    int i24 = a31;
                    int i25 = d2.getInt(i24);
                    a31 = i24;
                    int i26 = a32;
                    int c10 = z8.c(d2.getInt(i26));
                    a32 = i26;
                    int i27 = a33;
                    if (d2.getInt(i27) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    a33 = i27;
                    int i28 = a34;
                    if (d2.getInt(i28) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a34 = i28;
                    int i29 = a35;
                    if (d2.getInt(i29) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a35 = i29;
                    int i30 = a36;
                    if (d2.getInt(i30) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    a36 = i30;
                    int i31 = a37;
                    long j18 = d2.getLong(i31);
                    a37 = i31;
                    int i32 = a38;
                    long j19 = d2.getLong(i32);
                    a38 = i32;
                    int i33 = a39;
                    if (!d2.isNull(i33)) {
                        bArr = d2.getBlob(i33);
                    }
                    a39 = i33;
                    arrayList.add(new p(string, e, string2, string3, a40, a41, j10, j11, j12, new a6.d(c10, z9, z10, z11, z12, j18, j19, z8.a(bArr)), i11, b10, j13, j14, j15, j16, z3, d10, i18, i20, j17, i23, i25));
                    a21 = i13;
                    i10 = i12;
                }
                d2.close();
                a0Var.m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                d2.close();
                a0Var.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            a0Var = k3;
        }
    }

    public final ArrayList d() {
        a0 a0Var;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        a0 k3 = a0.k(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        Cursor d2 = c0.d(workDatabase_Impl, k3, false);
        try {
            int a10 = b0.a(d2, FacebookMediationAdapter.KEY_ID);
            int a11 = b0.a(d2, "state");
            int a12 = b0.a(d2, "worker_class_name");
            int a13 = b0.a(d2, "input_merger_class_name");
            int a14 = b0.a(d2, "input");
            int a15 = b0.a(d2, "output");
            int a16 = b0.a(d2, "initial_delay");
            int a17 = b0.a(d2, "interval_duration");
            int a18 = b0.a(d2, "flex_duration");
            int a19 = b0.a(d2, "run_attempt_count");
            int a20 = b0.a(d2, "backoff_policy");
            int a21 = b0.a(d2, "backoff_delay_duration");
            int a22 = b0.a(d2, "last_enqueue_time");
            a0Var = k3;
            try {
                int a23 = b0.a(d2, "minimum_retention_duration");
                int a24 = b0.a(d2, "schedule_requested_at");
                int a25 = b0.a(d2, "run_in_foreground");
                int a26 = b0.a(d2, "out_of_quota_policy");
                int a27 = b0.a(d2, "period_count");
                int a28 = b0.a(d2, "generation");
                int a29 = b0.a(d2, "next_schedule_time_override");
                int a30 = b0.a(d2, "next_schedule_time_override_generation");
                int a31 = b0.a(d2, "stop_reason");
                int a32 = b0.a(d2, "required_network_type");
                int a33 = b0.a(d2, "requires_charging");
                int a34 = b0.a(d2, "requires_device_idle");
                int a35 = b0.a(d2, "requires_battery_not_low");
                int a36 = b0.a(d2, "requires_storage_not_low");
                int a37 = b0.a(d2, "trigger_content_update_delay");
                int a38 = b0.a(d2, "trigger_max_content_delay");
                int a39 = b0.a(d2, "content_uri_triggers");
                int i = a23;
                ArrayList arrayList = new ArrayList(d2.getCount());
                while (d2.moveToNext()) {
                    byte[] bArr = null;
                    if (d2.isNull(a10)) {
                        string = null;
                    } else {
                        string = d2.getString(a10);
                    }
                    int e = z8.e(d2.getInt(a11));
                    if (d2.isNull(a12)) {
                        string2 = null;
                    } else {
                        string2 = d2.getString(a12);
                    }
                    if (d2.isNull(a13)) {
                        string3 = null;
                    } else {
                        string3 = d2.getString(a13);
                    }
                    if (d2.isNull(a14)) {
                        blob = null;
                    } else {
                        blob = d2.getBlob(a14);
                    }
                    a6.g a40 = a6.a(blob);
                    if (d2.isNull(a15)) {
                        blob2 = null;
                    } else {
                        blob2 = d2.getBlob(a15);
                    }
                    a6.g a41 = a6.a(blob2);
                    long j10 = d2.getLong(a16);
                    long j11 = d2.getLong(a17);
                    long j12 = d2.getLong(a18);
                    int i10 = d2.getInt(a19);
                    int b10 = z8.b(d2.getInt(a20));
                    long j13 = d2.getLong(a21);
                    long j14 = d2.getLong(a22);
                    int i11 = i;
                    long j15 = d2.getLong(i11);
                    int i12 = a22;
                    int i13 = a24;
                    long j16 = d2.getLong(i13);
                    a24 = i13;
                    int i14 = a25;
                    if (d2.getInt(i14) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    a25 = i14;
                    int i15 = a26;
                    int d10 = z8.d(d2.getInt(i15));
                    a26 = i15;
                    int i16 = a27;
                    int i17 = d2.getInt(i16);
                    a27 = i16;
                    int i18 = a28;
                    int i19 = d2.getInt(i18);
                    a28 = i18;
                    int i20 = a29;
                    long j17 = d2.getLong(i20);
                    a29 = i20;
                    int i21 = a30;
                    int i22 = d2.getInt(i21);
                    a30 = i21;
                    int i23 = a31;
                    int i24 = d2.getInt(i23);
                    a31 = i23;
                    int i25 = a32;
                    int c10 = z8.c(d2.getInt(i25));
                    a32 = i25;
                    int i26 = a33;
                    if (d2.getInt(i26) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    a33 = i26;
                    int i27 = a34;
                    if (d2.getInt(i27) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a34 = i27;
                    int i28 = a35;
                    if (d2.getInt(i28) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a35 = i28;
                    int i29 = a36;
                    if (d2.getInt(i29) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    a36 = i29;
                    int i30 = a37;
                    long j18 = d2.getLong(i30);
                    a37 = i30;
                    int i31 = a38;
                    long j19 = d2.getLong(i31);
                    a38 = i31;
                    int i32 = a39;
                    if (!d2.isNull(i32)) {
                        bArr = d2.getBlob(i32);
                    }
                    a39 = i32;
                    arrayList.add(new p(string, e, string2, string3, a40, a41, j10, j11, j12, new a6.d(c10, z9, z10, z11, z12, j18, j19, z8.a(bArr)), i10, b10, j13, j14, j15, j16, z3, d10, i17, i19, j17, i22, i24));
                    a22 = i12;
                    i = i11;
                }
                d2.close();
                a0Var.m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                d2.close();
                a0Var.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            a0Var = k3;
        }
    }

    public final ArrayList e() {
        a0 a0Var;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        a0 k3 = a0.k(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        Cursor d2 = c0.d(workDatabase_Impl, k3, false);
        try {
            int a10 = b0.a(d2, FacebookMediationAdapter.KEY_ID);
            int a11 = b0.a(d2, "state");
            int a12 = b0.a(d2, "worker_class_name");
            int a13 = b0.a(d2, "input_merger_class_name");
            int a14 = b0.a(d2, "input");
            int a15 = b0.a(d2, "output");
            int a16 = b0.a(d2, "initial_delay");
            int a17 = b0.a(d2, "interval_duration");
            int a18 = b0.a(d2, "flex_duration");
            int a19 = b0.a(d2, "run_attempt_count");
            int a20 = b0.a(d2, "backoff_policy");
            int a21 = b0.a(d2, "backoff_delay_duration");
            int a22 = b0.a(d2, "last_enqueue_time");
            a0Var = k3;
            try {
                int a23 = b0.a(d2, "minimum_retention_duration");
                int a24 = b0.a(d2, "schedule_requested_at");
                int a25 = b0.a(d2, "run_in_foreground");
                int a26 = b0.a(d2, "out_of_quota_policy");
                int a27 = b0.a(d2, "period_count");
                int a28 = b0.a(d2, "generation");
                int a29 = b0.a(d2, "next_schedule_time_override");
                int a30 = b0.a(d2, "next_schedule_time_override_generation");
                int a31 = b0.a(d2, "stop_reason");
                int a32 = b0.a(d2, "required_network_type");
                int a33 = b0.a(d2, "requires_charging");
                int a34 = b0.a(d2, "requires_device_idle");
                int a35 = b0.a(d2, "requires_battery_not_low");
                int a36 = b0.a(d2, "requires_storage_not_low");
                int a37 = b0.a(d2, "trigger_content_update_delay");
                int a38 = b0.a(d2, "trigger_max_content_delay");
                int a39 = b0.a(d2, "content_uri_triggers");
                int i = a23;
                ArrayList arrayList = new ArrayList(d2.getCount());
                while (d2.moveToNext()) {
                    byte[] bArr = null;
                    if (d2.isNull(a10)) {
                        string = null;
                    } else {
                        string = d2.getString(a10);
                    }
                    int e = z8.e(d2.getInt(a11));
                    if (d2.isNull(a12)) {
                        string2 = null;
                    } else {
                        string2 = d2.getString(a12);
                    }
                    if (d2.isNull(a13)) {
                        string3 = null;
                    } else {
                        string3 = d2.getString(a13);
                    }
                    if (d2.isNull(a14)) {
                        blob = null;
                    } else {
                        blob = d2.getBlob(a14);
                    }
                    a6.g a40 = a6.a(blob);
                    if (d2.isNull(a15)) {
                        blob2 = null;
                    } else {
                        blob2 = d2.getBlob(a15);
                    }
                    a6.g a41 = a6.a(blob2);
                    long j10 = d2.getLong(a16);
                    long j11 = d2.getLong(a17);
                    long j12 = d2.getLong(a18);
                    int i10 = d2.getInt(a19);
                    int b10 = z8.b(d2.getInt(a20));
                    long j13 = d2.getLong(a21);
                    long j14 = d2.getLong(a22);
                    int i11 = i;
                    long j15 = d2.getLong(i11);
                    int i12 = a22;
                    int i13 = a24;
                    long j16 = d2.getLong(i13);
                    a24 = i13;
                    int i14 = a25;
                    if (d2.getInt(i14) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    a25 = i14;
                    int i15 = a26;
                    int d10 = z8.d(d2.getInt(i15));
                    a26 = i15;
                    int i16 = a27;
                    int i17 = d2.getInt(i16);
                    a27 = i16;
                    int i18 = a28;
                    int i19 = d2.getInt(i18);
                    a28 = i18;
                    int i20 = a29;
                    long j17 = d2.getLong(i20);
                    a29 = i20;
                    int i21 = a30;
                    int i22 = d2.getInt(i21);
                    a30 = i21;
                    int i23 = a31;
                    int i24 = d2.getInt(i23);
                    a31 = i23;
                    int i25 = a32;
                    int c10 = z8.c(d2.getInt(i25));
                    a32 = i25;
                    int i26 = a33;
                    if (d2.getInt(i26) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    a33 = i26;
                    int i27 = a34;
                    if (d2.getInt(i27) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a34 = i27;
                    int i28 = a35;
                    if (d2.getInt(i28) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a35 = i28;
                    int i29 = a36;
                    if (d2.getInt(i29) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    a36 = i29;
                    int i30 = a37;
                    long j18 = d2.getLong(i30);
                    a37 = i30;
                    int i31 = a38;
                    long j19 = d2.getLong(i31);
                    a38 = i31;
                    int i32 = a39;
                    if (!d2.isNull(i32)) {
                        bArr = d2.getBlob(i32);
                    }
                    a39 = i32;
                    arrayList.add(new p(string, e, string2, string3, a40, a41, j10, j11, j12, new a6.d(c10, z9, z10, z11, z12, j18, j19, z8.a(bArr)), i10, b10, j13, j14, j15, j16, z3, d10, i17, i19, j17, i22, i24));
                    a22 = i12;
                    i = i11;
                }
                d2.close();
                a0Var.m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                d2.close();
                a0Var.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            a0Var = k3;
        }
    }

    public final ArrayList f() {
        a0 a0Var;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        a0 k3 = a0.k(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        Cursor d2 = c0.d(workDatabase_Impl, k3, false);
        try {
            int a10 = b0.a(d2, FacebookMediationAdapter.KEY_ID);
            int a11 = b0.a(d2, "state");
            int a12 = b0.a(d2, "worker_class_name");
            int a13 = b0.a(d2, "input_merger_class_name");
            int a14 = b0.a(d2, "input");
            int a15 = b0.a(d2, "output");
            int a16 = b0.a(d2, "initial_delay");
            int a17 = b0.a(d2, "interval_duration");
            int a18 = b0.a(d2, "flex_duration");
            int a19 = b0.a(d2, "run_attempt_count");
            int a20 = b0.a(d2, "backoff_policy");
            int a21 = b0.a(d2, "backoff_delay_duration");
            int a22 = b0.a(d2, "last_enqueue_time");
            a0Var = k3;
            try {
                int a23 = b0.a(d2, "minimum_retention_duration");
                int a24 = b0.a(d2, "schedule_requested_at");
                int a25 = b0.a(d2, "run_in_foreground");
                int a26 = b0.a(d2, "out_of_quota_policy");
                int a27 = b0.a(d2, "period_count");
                int a28 = b0.a(d2, "generation");
                int a29 = b0.a(d2, "next_schedule_time_override");
                int a30 = b0.a(d2, "next_schedule_time_override_generation");
                int a31 = b0.a(d2, "stop_reason");
                int a32 = b0.a(d2, "required_network_type");
                int a33 = b0.a(d2, "requires_charging");
                int a34 = b0.a(d2, "requires_device_idle");
                int a35 = b0.a(d2, "requires_battery_not_low");
                int a36 = b0.a(d2, "requires_storage_not_low");
                int a37 = b0.a(d2, "trigger_content_update_delay");
                int a38 = b0.a(d2, "trigger_max_content_delay");
                int a39 = b0.a(d2, "content_uri_triggers");
                int i = a23;
                ArrayList arrayList = new ArrayList(d2.getCount());
                while (d2.moveToNext()) {
                    byte[] bArr = null;
                    if (d2.isNull(a10)) {
                        string = null;
                    } else {
                        string = d2.getString(a10);
                    }
                    int e = z8.e(d2.getInt(a11));
                    if (d2.isNull(a12)) {
                        string2 = null;
                    } else {
                        string2 = d2.getString(a12);
                    }
                    if (d2.isNull(a13)) {
                        string3 = null;
                    } else {
                        string3 = d2.getString(a13);
                    }
                    if (d2.isNull(a14)) {
                        blob = null;
                    } else {
                        blob = d2.getBlob(a14);
                    }
                    a6.g a40 = a6.a(blob);
                    if (d2.isNull(a15)) {
                        blob2 = null;
                    } else {
                        blob2 = d2.getBlob(a15);
                    }
                    a6.g a41 = a6.a(blob2);
                    long j10 = d2.getLong(a16);
                    long j11 = d2.getLong(a17);
                    long j12 = d2.getLong(a18);
                    int i10 = d2.getInt(a19);
                    int b10 = z8.b(d2.getInt(a20));
                    long j13 = d2.getLong(a21);
                    long j14 = d2.getLong(a22);
                    int i11 = i;
                    long j15 = d2.getLong(i11);
                    int i12 = a22;
                    int i13 = a24;
                    long j16 = d2.getLong(i13);
                    a24 = i13;
                    int i14 = a25;
                    if (d2.getInt(i14) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    a25 = i14;
                    int i15 = a26;
                    int d10 = z8.d(d2.getInt(i15));
                    a26 = i15;
                    int i16 = a27;
                    int i17 = d2.getInt(i16);
                    a27 = i16;
                    int i18 = a28;
                    int i19 = d2.getInt(i18);
                    a28 = i18;
                    int i20 = a29;
                    long j17 = d2.getLong(i20);
                    a29 = i20;
                    int i21 = a30;
                    int i22 = d2.getInt(i21);
                    a30 = i21;
                    int i23 = a31;
                    int i24 = d2.getInt(i23);
                    a31 = i23;
                    int i25 = a32;
                    int c10 = z8.c(d2.getInt(i25));
                    a32 = i25;
                    int i26 = a33;
                    if (d2.getInt(i26) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    a33 = i26;
                    int i27 = a34;
                    if (d2.getInt(i27) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a34 = i27;
                    int i28 = a35;
                    if (d2.getInt(i28) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a35 = i28;
                    int i29 = a36;
                    if (d2.getInt(i29) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    a36 = i29;
                    int i30 = a37;
                    long j18 = d2.getLong(i30);
                    a37 = i30;
                    int i31 = a38;
                    long j19 = d2.getLong(i31);
                    a38 = i31;
                    int i32 = a39;
                    if (!d2.isNull(i32)) {
                        bArr = d2.getBlob(i32);
                    }
                    a39 = i32;
                    arrayList.add(new p(string, e, string2, string3, a40, a41, j10, j11, j12, new a6.d(c10, z9, z10, z11, z12, j18, j19, z8.a(bArr)), i10, b10, j13, j14, j15, j16, z3, d10, i17, i19, j17, i22, i24));
                    a22 = i12;
                    i = i11;
                }
                d2.close();
                a0Var.m();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                d2.close();
                a0Var.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            a0Var = k3;
        }
    }

    public final int g(String str) {
        Integer valueOf;
        a0 k3 = a0.k(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            k3.g(1);
        } else {
            k3.n(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        int i = 0;
        Cursor d2 = c0.d(workDatabase_Impl, k3, false);
        try {
            if (d2.moveToFirst()) {
                if (d2.isNull(0)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(d2.getInt(0));
                }
                if (valueOf != null) {
                    i = z8.e(valueOf.intValue());
                }
            }
            return i;
        } finally {
            d2.close();
            k3.m();
        }
    }

    public final ArrayList h(String str) {
        String string;
        a0 k3 = a0.k(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            k3.g(1);
        } else {
            k3.n(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        Cursor d2 = c0.d(workDatabase_Impl, k3, false);
        try {
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                if (d2.isNull(0)) {
                    string = null;
                } else {
                    string = d2.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            d2.close();
            k3.m();
        }
    }

    public final ArrayList i() {
        String string;
        a0 k3 = a0.k(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        k3.n(1, "offline_ping_sender_work");
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        Cursor d2 = c0.d(workDatabase_Impl, k3, false);
        try {
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                if (d2.isNull(0)) {
                    string = null;
                } else {
                    string = d2.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            d2.close();
            k3.m();
        }
    }

    public final p j(String str) {
        a0 a0Var;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        a0 k3 = a0.k(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            k3.g(1);
        } else {
            k3.n(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        Cursor d2 = c0.d(workDatabase_Impl, k3, false);
        try {
            int a10 = b0.a(d2, FacebookMediationAdapter.KEY_ID);
            int a11 = b0.a(d2, "state");
            int a12 = b0.a(d2, "worker_class_name");
            int a13 = b0.a(d2, "input_merger_class_name");
            int a14 = b0.a(d2, "input");
            int a15 = b0.a(d2, "output");
            int a16 = b0.a(d2, "initial_delay");
            int a17 = b0.a(d2, "interval_duration");
            int a18 = b0.a(d2, "flex_duration");
            int a19 = b0.a(d2, "run_attempt_count");
            int a20 = b0.a(d2, "backoff_policy");
            int a21 = b0.a(d2, "backoff_delay_duration");
            int a22 = b0.a(d2, "last_enqueue_time");
            a0Var = k3;
            try {
                int a23 = b0.a(d2, "minimum_retention_duration");
                int a24 = b0.a(d2, "schedule_requested_at");
                int a25 = b0.a(d2, "run_in_foreground");
                int a26 = b0.a(d2, "out_of_quota_policy");
                int a27 = b0.a(d2, "period_count");
                int a28 = b0.a(d2, "generation");
                int a29 = b0.a(d2, "next_schedule_time_override");
                int a30 = b0.a(d2, "next_schedule_time_override_generation");
                int a31 = b0.a(d2, "stop_reason");
                int a32 = b0.a(d2, "required_network_type");
                int a33 = b0.a(d2, "requires_charging");
                int a34 = b0.a(d2, "requires_device_idle");
                int a35 = b0.a(d2, "requires_battery_not_low");
                int a36 = b0.a(d2, "requires_storage_not_low");
                int a37 = b0.a(d2, "trigger_content_update_delay");
                int a38 = b0.a(d2, "trigger_max_content_delay");
                int a39 = b0.a(d2, "content_uri_triggers");
                p pVar = null;
                byte[] blob3 = null;
                if (d2.moveToFirst()) {
                    if (d2.isNull(a10)) {
                        string = null;
                    } else {
                        string = d2.getString(a10);
                    }
                    int e = z8.e(d2.getInt(a11));
                    if (d2.isNull(a12)) {
                        string2 = null;
                    } else {
                        string2 = d2.getString(a12);
                    }
                    if (d2.isNull(a13)) {
                        string3 = null;
                    } else {
                        string3 = d2.getString(a13);
                    }
                    if (d2.isNull(a14)) {
                        blob = null;
                    } else {
                        blob = d2.getBlob(a14);
                    }
                    a6.g a40 = a6.a(blob);
                    if (d2.isNull(a15)) {
                        blob2 = null;
                    } else {
                        blob2 = d2.getBlob(a15);
                    }
                    a6.g a41 = a6.a(blob2);
                    long j10 = d2.getLong(a16);
                    long j11 = d2.getLong(a17);
                    long j12 = d2.getLong(a18);
                    int i = d2.getInt(a19);
                    int b10 = z8.b(d2.getInt(a20));
                    long j13 = d2.getLong(a21);
                    long j14 = d2.getLong(a22);
                    long j15 = d2.getLong(a23);
                    long j16 = d2.getLong(a24);
                    if (d2.getInt(a25) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int d10 = z8.d(d2.getInt(a26));
                    int i10 = d2.getInt(a27);
                    int i11 = d2.getInt(a28);
                    long j17 = d2.getLong(a29);
                    int i12 = d2.getInt(a30);
                    int i13 = d2.getInt(a31);
                    int c10 = z8.c(d2.getInt(a32));
                    if (d2.getInt(a33) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (d2.getInt(a34) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (d2.getInt(a35) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (d2.getInt(a36) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    long j18 = d2.getLong(a37);
                    long j19 = d2.getLong(a38);
                    if (!d2.isNull(a39)) {
                        blob3 = d2.getBlob(a39);
                    }
                    pVar = new p(string, e, string2, string3, a40, a41, j10, j11, j12, new a6.d(c10, z9, z10, z11, z12, j18, j19, z8.a(blob3)), i, b10, j13, j14, j15, j16, z3, d10, i10, i11, j17, i12, i13);
                }
                d2.close();
                a0Var.m();
                return pVar;
            } catch (Throwable th) {
                th = th;
                d2.close();
                a0Var.m();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            a0Var = k3;
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, j6.o] */
    public final ArrayList k(String str) {
        String string;
        a0 k3 = a0.k(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            k3.g(1);
        } else {
            k3.n(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        Cursor d2 = c0.d(workDatabase_Impl, k3, false);
        try {
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                if (d2.isNull(0)) {
                    string = null;
                } else {
                    string = d2.getString(0);
                }
                int e = z8.e(d2.getInt(1));
                string.getClass();
                Object obj = new Object();
                obj.f18942a = string;
                obj.f18943b = e;
                arrayList.add(obj);
            }
            return arrayList;
        } finally {
            d2.close();
            k3.m();
        }
    }

    public final void l(long j10, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        h hVar = this.f18974l;
        r5.j a10 = hVar.a();
        a10.b(1, j10);
        if (str == null) {
            a10.g(2);
        } else {
            a10.n(2, str);
        }
        workDatabase_Impl.c();
        try {
            a10.f();
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.h();
            hVar.f(a10);
        }
    }

    public final void m(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        h hVar = this.f18973k;
        r5.j a10 = hVar.a();
        if (str == null) {
            a10.g(1);
        } else {
            a10.n(1, str);
        }
        a10.b(2, i);
        workDatabase_Impl.c();
        try {
            a10.f();
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.h();
            hVar.f(a10);
        }
    }

    public final void n(long j10, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        h hVar = this.f18971h;
        r5.j a10 = hVar.a();
        a10.b(1, j10);
        if (str == null) {
            a10.g(2);
        } else {
            a10.n(2, str);
        }
        workDatabase_Impl.c();
        try {
            a10.f();
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.h();
            hVar.f(a10);
        }
    }

    public final void o(String str, a6.g gVar) {
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        h hVar = this.f18970g;
        r5.j a10 = hVar.a();
        byte[] c10 = a6.g.c(gVar);
        if (c10 == null) {
            a10.g(1);
        } else {
            a10.z(c10, 1);
        }
        if (str == null) {
            a10.g(2);
        } else {
            a10.n(2, str);
        }
        workDatabase_Impl.c();
        try {
            a10.f();
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.h();
            hVar.f(a10);
        }
    }

    public final void p(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        h hVar = this.f18968d;
        r5.j a10 = hVar.a();
        a10.b(1, z8.f(i));
        if (str == null) {
            a10.g(2);
        } else {
            a10.n(2, str);
        }
        workDatabase_Impl.c();
        try {
            a10.f();
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.h();
            hVar.f(a10);
        }
    }

    public final void q(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f18965a;
        workDatabase_Impl.b();
        h hVar = this.f18976n;
        r5.j a10 = hVar.a();
        a10.b(1, i);
        if (str == null) {
            a10.g(2);
        } else {
            a10.n(2, str);
        }
        workDatabase_Impl.c();
        try {
            a10.f();
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.h();
            hVar.f(a10);
        }
    }
}