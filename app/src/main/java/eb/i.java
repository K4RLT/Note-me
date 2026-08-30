package eb;
import x.n;
import k0.y;
import p.a;
import q.x;
import r0.g;
import r2.f;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.js;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends d3 {
    public static final String[] A = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] B = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] C = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;"};
    public static final String[] D = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] E = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] F = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] G = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] H = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] I = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] J = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: y, reason: collision with root package name */
    public final k f16175y;

    /* renamed from: z, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.f3 f16176z;

    public i(h3 h3Var) {
        super(h3Var);
        this.f16176z = new com.google.android.gms.internal.ads.f3(((d1) this.f3443v).H);
        this.f16175y = new k(this, ((d1) this.f3443v).f16102u);
    }

    public static void Q(ContentValues contentValues, Object obj) {
        fa.y.e("value");
        fa.y.h(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            x.n("Invalid value type");
        }
    }

    @Override // eb.d3
    public final boolean A() {
        return false;
    }

    public final void A0() {
        d1 d1Var = (d1) this.f3443v;
        u();
        y();
        if (f0()) {
            h3 h3Var = this.f16125w;
            long a10 = h3Var.C.f16388z.a();
            d1Var.H.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a10) > ((Long) v.f16433y.a(null)).longValue()) {
                h3Var.C.f16388z.b(elapsedRealtime);
                u();
                y();
                if (f0()) {
                    SQLiteDatabase B2 = B();
                    d1Var.H.getClass();
                    int delete = B2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(e.H())});
                    if (delete > 0) {
                        f().I.f(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final SQLiteDatabase B() {
        u();
        try {
            return this.f16175y.getWritableDatabase();
        } catch (SQLiteException e) {
            f().D.f(e, "Error opening database");
            throw e;
        }
    }

    public final void B0() {
        y();
        B().setTransactionSuccessful();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String C() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.B()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3a
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3a
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            eb.k0 r3 = r6.f()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.ads.js r3 = r3.A     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            f(r2, r4)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.i.C():java.lang.String");
    }

    public final long D(com.google.android.gms.internal.measurement.h3 h3Var) {
        u();
        y();
        fa.y.e(h3Var.b2());
        byte[] c10 = h3Var.c();
        long C2 = v().C(c10);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", h3Var.b2());
        contentValues.put("metadata_fingerprint", Long.valueOf(C2));
        contentValues.put("metadata", c10);
        try {
            B().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return C2;
        } catch (SQLiteException e) {
            f().A.h("Error storing raw event metadata. appId", y(h3Var.b2()), e);
            throw e;
        }
    }

    public final long E(String str) {
        fa.y.e(str);
        u();
        y();
        try {
            return B().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, ((d1) this.f3443v).A.z(str, v.f16417q))))});
        } catch (SQLiteException e) {
            f().A.h("Error deleting over the limit events. appId", y(str), e);
            return 0L;
        }
    }

    public final long F(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j11 = cursor.getLong(0);
                    cursor.close();
                    return j11;
                }
                cursor.close();
                return j10;
            } catch (SQLiteException e) {
                f().A.h("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eb.j, java.lang.Object] */
    public final j G(long j10, String str, long j11, boolean z3, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        fa.y.e(str);
        u();
        y();
        String[] strArr = {str};
        Object obj = new Object();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase B2 = B();
                Cursor query = B2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    f().D.f(y(str), "Not updating daily counts, app is not known. appId");
                    query.close();
                    return obj;
                }
                if (query.getLong(0) == j10) {
                    obj.f16185b = query.getLong(1);
                    obj.f16184a = query.getLong(2);
                    obj.f16186c = query.getLong(3);
                    obj.f16187d = query.getLong(4);
                    obj.e = query.getLong(5);
                    obj.f16188f = query.getLong(6);
                }
                if (z3) {
                    obj.f16185b += j11;
                }
                if (z9) {
                    obj.f16184a += j11;
                }
                if (z10) {
                    obj.f16186c += j11;
                }
                if (z11) {
                    obj.f16187d += j11;
                }
                if (z12) {
                    obj.e += j11;
                }
                if (z13) {
                    obj.f16188f += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(obj.f16184a));
                contentValues.put("daily_events_count", Long.valueOf(obj.f16185b));
                contentValues.put("daily_conversions_count", Long.valueOf(obj.f16186c));
                contentValues.put("daily_error_events_count", Long.valueOf(obj.f16187d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(obj.e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(obj.f16188f));
                B2.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return obj;
            } catch (SQLiteException e) {
                f().A.h("Error updating daily counts. appId", y(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return obj;
            }
        } finally {
        }
    }

    public final Object H(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            f().A.f(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
                            return null;
                        }
                        f().A.g("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i);
                }
                return Double.valueOf(cursor.getDouble(i));
            }
            return Long.valueOf(cursor.getLong(i));
        }
        f().A.g("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String I(long r4) {
        /*
            r3 = this;
            r3.u()
            r3.y()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.B()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 != 0) goto L33
            eb.k0 r5 = f()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.internal.ads.js r5 = r5.I     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.g(r1)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r0
        L2e:
            r5 = move-exception
            r0 = r4
            goto L51
        L31:
            r5 = move-exception
            goto L40
        L33:
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r5
        L3c:
            r5 = move-exception
            goto L51
        L3e:
            r5 = move-exception
            r4 = r0
        L40:
            eb.k0 r1 = f()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.js r1 = r1.A     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "Error selecting expired configs"
            r1.f(r5, r2)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L50
            r4.close()
        L50:
            return r0
        L51:
            if (r0 == 0) goto L56
            r0.close()
        L56:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.i.I(long):java.lang.String");
    }

    public final String J(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
                cursor.close();
                return "";
            } catch (SQLiteException e) {
                f().A.h("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List L(String str, int i, int i10) {
        boolean z3;
        boolean z9;
        byte[] l0;
        long j10;
        long j11;
        u();
        y();
        int i11 = 1;
        if (i > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        fa.y.b(z3);
        if (i10 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        fa.y.b(z9);
        fa.y.e(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!query.moveToFirst()) {
                    List list = Collections.EMPTY_LIST;
                    query.close();
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                int i12 = 0;
                while (true) {
                    long j12 = query.getLong(0);
                    try {
                        l0 = v().l0(query.getBlob(i11));
                    } catch (IOException e) {
                        f().A.h("Failed to unzip queued bundle. appId", y(str), e);
                    }
                    if (!arrayList.isEmpty() && l0.length + i12 > i10) {
                        break;
                    }
                    try {
                        com.google.android.gms.internal.measurement.g3 g3Var = (com.google.android.gms.internal.measurement.g3) m0.H(com.google.android.gms.internal.measurement.h3.Z1(), l0);
                        if (!arrayList.isEmpty()) {
                            com.google.android.gms.internal.measurement.h3 h3Var = (com.google.android.gms.internal.measurement.h3) ((Pair) arrayList.get(0)).first;
                            com.google.android.gms.internal.measurement.h3 h3Var2 = (com.google.android.gms.internal.measurement.h3) g3Var.a();
                            if (!h3Var.G().equals(h3Var2.G()) || !h3Var.F().equals(h3Var2.F()) || h3Var.W() != h3Var2.W() || !h3Var.H().equals(h3Var2.H())) {
                                break;
                            }
                            Iterator it = h3Var.U().iterator();
                            while (true) {
                                j10 = -1;
                                if (it.hasNext()) {
                                    com.google.android.gms.internal.measurement.o3 o3Var = (com.google.android.gms.internal.measurement.o3) it.next();
                                    if ("_npa".equals(o3Var.C())) {
                                        j11 = o3Var.y();
                                        break;
                                    }
                                } else {
                                    j11 = -1;
                                    break;
                                }
                            }
                            Iterator it2 = h3Var2.U().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                com.google.android.gms.internal.measurement.o3 o3Var2 = (com.google.android.gms.internal.measurement.o3) it2.next();
                                if ("_npa".equals(o3Var2.C())) {
                                    j10 = o3Var2.y();
                                    break;
                                }
                            }
                            if (j11 != j10) {
                                break;
                            }
                        }
                        if (!query.isNull(2)) {
                            int i13 = query.getInt(2);
                            g3Var.b();
                            com.google.android.gms.internal.measurement.h3.r((com.google.android.gms.internal.measurement.h3) g3Var.f13639v, i13);
                        }
                        i12 += l0.length;
                        arrayList.add(Pair.create((com.google.android.gms.internal.measurement.h3) g3Var.a(), Long.valueOf(j12)));
                    } catch (IOException e8) {
                        f().A.h("Failed to merge queued bundle. appId", y(str), e8);
                    }
                    if (!query.moveToNext() || i12 > i10) {
                        break;
                    }
                    i11 = 1;
                }
                query.close();
                return arrayList;
            } catch (SQLiteException e10) {
                f().A.h("Error querying bundles. appId", y(str), e10);
                List list2 = Collections.EMPTY_LIST;
                if (0 != 0) {
                    cursor.close();
                }
                return list2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List M(String str, String str2, String str3) {
        fa.y.e(str);
        u();
        y();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb2.append(" and name glob ?");
        }
        return O(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        f().A.f(java.lang.Integer.valueOf(com.facebook.ads.AdError.NETWORK_ERROR_CODE), "Read more than the max allowed conditional properties, ignoring extra");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List O(java.lang.String r21, java.lang.String[] r22) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.i.O(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void P(ContentValues contentValues) {
        try {
            SQLiteDatabase B2 = B();
            if (contentValues.getAsString("app_id") == null) {
                f().C.f(y("app_id"), "Value of the primary key is not set.");
            } else if (B2.update("consent_settings", contentValues, "app_id = ?", new String[]{r3}) == 0 && B2.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                f().A.h("Failed to insert/update table (got -1). key", y("consent_settings"), y("app_id"));
            }
        } catch (SQLiteException e) {
            f().A.i("Error storing into table. key", y("consent_settings"), y("app_id"), e);
        }
    }

    public final void R(com.google.android.gms.internal.measurement.h3 h3Var, boolean z3) {
        u();
        y();
        fa.y.e(h3Var.b2());
        fa.y.k(h3Var.s0());
        A0();
        ((d1) this.f3443v).H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (h3Var.I1() < currentTimeMillis - e.H() || h3Var.I1() > e.H() + currentTimeMillis) {
            f().D.i("Storing bundle outside of the max uploading time span. appId, now, timestamp", y(h3Var.b2()), Long.valueOf(currentTimeMillis), Long.valueOf(h3Var.I1()));
        }
        try {
            byte[] j02 = v().j0(h3Var.c());
            f().I.f(Integer.valueOf(j02.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", h3Var.b2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(h3Var.I1()));
            contentValues.put("data", j02);
            contentValues.put("has_realtime", Integer.valueOf(z3 ? 1 : 0));
            if (h3Var.z0()) {
                contentValues.put("retry_count", Integer.valueOf(h3Var.h1()));
            }
            try {
                if (B().insert("queue", null, contentValues) == -1) {
                    f().A.f(y(h3Var.b2()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                f().A.h("Error storing bundle. appId", y(h3Var.b2()), e);
            }
        } catch (IOException e8) {
            f().A.h("Data loss. Failed to serialize bundle. appId", y(h3Var.b2()), e8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0047, code lost:
    
        if (r12.G(r4).i(r10) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x037e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(eb.n0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.i.S(eb.n0, boolean):void");
    }

    public final void T(String str, p pVar) {
        Long l10;
        fa.y.h(pVar);
        u();
        y();
        ContentValues contentValues = new ContentValues();
        String str2 = pVar.f16294a;
        contentValues.put("app_id", str2);
        contentValues.put("name", pVar.f16295b);
        contentValues.put("lifetime_count", Long.valueOf(pVar.f16296c));
        contentValues.put("current_bundle_count", Long.valueOf(pVar.f16297d));
        contentValues.put("last_fire_timestamp", Long.valueOf(pVar.f16298f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(pVar.f16299g));
        contentValues.put("last_bundled_day", pVar.f16300h);
        contentValues.put("last_sampled_complex_event_id", pVar.i);
        contentValues.put("last_sampling_rate", pVar.f16301j);
        contentValues.put("current_session_count", Long.valueOf(pVar.e));
        Boolean bool = pVar.f16302k;
        if (bool != null && bool.booleanValue()) {
            l10 = 1L;
        } else {
            l10 = null;
        }
        contentValues.put("last_exempt_from_sampling", l10);
        try {
            if (B().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                f().A.f(y(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            f().A.h("Error storing event aggregates. appId", y(str2), e);
        }
    }

    public final void U(String str, o1 o1Var) {
        fa.y.h(str);
        u();
        y();
        j0(str, t0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", o1Var.o());
        P(contentValues);
    }

    public final void V(String str, b3 b3Var) {
        u();
        y();
        fa.y.e(str);
        ((d1) this.f3443v).H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = b3Var.f16071v;
        if (j10 < currentTimeMillis - e.H() || j10 > e.H() + currentTimeMillis) {
            f().D.i("Storing trigger URI outside of the max retention time span. appId, now, timestamp", y(str), Long.valueOf(currentTimeMillis), Long.valueOf(j10));
        }
        f().I.g("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", b3Var.f16070u);
        contentValues.put("source", Integer.valueOf(b3Var.f16072w));
        contentValues.put("timestamp_millis", Long.valueOf(j10));
        try {
            if (B().insert("trigger_uris", null, contentValues) == -1) {
                f().A.f(y(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            f().A.h("Error storing trigger URI. appId", y(str), e);
        }
    }

    public final void X(String str, Long l10, long j10, com.google.android.gms.internal.measurement.z2 z2Var) {
        u();
        y();
        fa.y.h(z2Var);
        fa.y.e(str);
        byte[] c10 = z2Var.c();
        f().I.h("Saving complex main event, appId, data size", ((d1) this.f3443v).G.c(str), Integer.valueOf(c10.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", c10);
        try {
            if (B().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                f().A.f(y(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            f().A.h("Error storing complex main event. appId", y(str), e);
        }
    }

    public final void Y(String str, String str2) {
        fa.y.e(str);
        fa.y.e(str2);
        u();
        y();
        try {
            B().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            f().A.i("Error deleting conditional property", y(str), ((d1) this.f3443v).G.g(str2), e);
        }
    }

    public final void Z(List list) {
        u();
        y();
        fa.y.h(list);
        if (((ArrayList) list).size() != 0) {
            if (!f0()) {
                return;
            }
            String k3 = a.k("(", TextUtils.join(",", list), ")");
            if (h0("SELECT COUNT(1) FROM queue WHERE rowid IN " + k3 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                f().D.g("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                B().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + k3 + " AND (retry_count IS NULL OR retry_count < 2147483647)");
                return;
            } catch (SQLiteException e) {
                f().A.f(e, "Error incrementing retry count. error");
                return;
            }
        }
        x.n("Given Integer is zero");
    }

    public final boolean a0(d dVar) {
        u();
        y();
        String str = dVar.f16093u;
        fa.y.h(str);
        if (q0(str, dVar.f16095w.f16212v) == null && h0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", dVar.f16094v);
        contentValues.put("name", dVar.f16095w.f16212v);
        Object zza = dVar.f16095w.zza();
        fa.y.h(zza);
        Q(contentValues, zza);
        contentValues.put("active", Boolean.valueOf(dVar.f16097y));
        contentValues.put("trigger_event_name", dVar.f16098z);
        contentValues.put("trigger_timeout", Long.valueOf(dVar.B));
        t();
        contentValues.put("timed_out_event", l3.n0(dVar.A));
        contentValues.put("creation_timestamp", Long.valueOf(dVar.f16096x));
        t();
        contentValues.put("triggered_event", l3.n0(dVar.C));
        contentValues.put("triggered_timestamp", Long.valueOf(dVar.f16095w.f16213w));
        contentValues.put("time_to_live", Long.valueOf(dVar.D));
        t();
        contentValues.put("expired_event", l3.n0(dVar.E));
        try {
            if (B().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                f().A.f(y(str), "Failed to insert/update conditional user property (got -1)");
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            f().A.h("Error storing conditional user property", y(str), e);
            return true;
        }
    }

    public final boolean b0(r rVar, long j10, boolean z3) {
        u();
        y();
        String str = rVar.f16336a;
        fa.y.e(str);
        m0 v2 = v();
        com.google.android.gms.internal.measurement.y2 C2 = com.google.android.gms.internal.measurement.z2.C();
        long j11 = rVar.e;
        C2.b();
        com.google.android.gms.internal.measurement.z2.z(j11, (com.google.android.gms.internal.measurement.z2) C2.f13639v);
        t tVar = rVar.f16340f;
        tVar.getClass();
        Bundle bundle = tVar.f16371u;
        for (String str2 : bundle.keySet()) {
            com.google.android.gms.internal.measurement.b3 D2 = com.google.android.gms.internal.measurement.c3.D();
            D2.e(str2);
            Object obj = bundle.get(str2);
            fa.y.h(obj);
            v2.V(D2, obj);
            C2.d(D2);
        }
        byte[] c10 = ((com.google.android.gms.internal.measurement.z2) C2.a()).c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("name", rVar.f16337b);
        contentValues.put("timestamp", Long.valueOf(rVar.f16339d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j10));
        contentValues.put("data", c10);
        contentValues.put("realtime", Integer.valueOf(z3 ? 1 : 0));
        try {
            if (B().insert("raw_events", null, contentValues) == -1) {
                f().A.f(y(str), "Failed to insert raw event (got -1). appId");
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            f().A.h("Error storing raw event. appId", y(str), e);
            return false;
        }
    }

    public final boolean c0(m3 m3Var) {
        String str = m3Var.f16243b;
        u();
        y();
        String str2 = m3Var.f16242a;
        String str3 = m3Var.f16244c;
        if (q0(str2, str3) == null) {
            if (l3.E0(str3)) {
                if (h0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(((d1) this.f3443v).A.z(str2, v.G), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3) && h0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(m3Var.f16245d));
        Q(contentValues, m3Var.e);
        try {
            if (B().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                f().A.f(y(str2), "Failed to insert/update user property (got -1). appId");
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            f().A.h("Error storing user property. appId", y(str2), e);
            return true;
        }
    }

    public final boolean d0(String str, int i, com.google.android.gms.internal.measurement.r1 r1Var) {
        Integer num;
        Boolean bool;
        y();
        u();
        fa.y.e(str);
        fa.y.h(r1Var);
        Integer num2 = null;
        if (r1Var.w().isEmpty()) {
            js jsVar = f().D;
            l0 y10 = y(str);
            Integer valueOf = Integer.valueOf(i);
            if (r1Var.C()) {
                num2 = Integer.valueOf(r1Var.t());
            }
            jsVar.i("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", y10, valueOf, String.valueOf(num2));
            return false;
        }
        byte[] c10 = r1Var.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        if (r1Var.C()) {
            num = Integer.valueOf(r1Var.t());
        } else {
            num = null;
        }
        contentValues.put("filter_id", num);
        contentValues.put("event_name", r1Var.w());
        if (r1Var.D()) {
            bool = Boolean.valueOf(r1Var.A());
        } else {
            bool = null;
        }
        contentValues.put("session_scoped", bool);
        contentValues.put("data", c10);
        try {
            if (B().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                f().A.f(y(str), "Failed to insert event filter (got -1). appId");
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            f().A.h("Error storing event filter. appId", y(str), e);
            return false;
        }
    }

    public final boolean e0(String str, int i, com.google.android.gms.internal.measurement.x1 x1Var) {
        Integer num;
        Boolean bool;
        y();
        u();
        fa.y.e(str);
        fa.y.h(x1Var);
        Integer num2 = null;
        if (x1Var.t().isEmpty()) {
            js jsVar = f().D;
            l0 y10 = y(str);
            Integer valueOf = Integer.valueOf(i);
            if (x1Var.x()) {
                num2 = Integer.valueOf(x1Var.p());
            }
            jsVar.i("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", y10, valueOf, String.valueOf(num2));
            return false;
        }
        byte[] c10 = x1Var.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        if (x1Var.x()) {
            num = Integer.valueOf(x1Var.p());
        } else {
            num = null;
        }
        contentValues.put("filter_id", num);
        contentValues.put("property_name", x1Var.t());
        if (x1Var.y()) {
            bool = Boolean.valueOf(x1Var.w());
        } else {
            bool = null;
        }
        contentValues.put("session_scoped", bool);
        contentValues.put("data", c10);
        try {
            if (B().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                f().A.f(y(str), "Failed to insert property filter (got -1). appId");
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            f().A.h("Error storing property filter. appId", y(str), e);
            return false;
        }
    }

    public final boolean f0() {
        return ((d1) this.f3443v).f16102u.getDatabasePath("google_app_measurement.db").exists();
    }

    public final long g0(String str) {
        fa.y.e(str);
        fa.y.e("first_open_count");
        u();
        y();
        SQLiteDatabase B2 = B();
        B2.beginTransaction();
        long j10 = 0;
        try {
            try {
                long F2 = F("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (F2 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (B2.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        f().A.h("Failed to insert column (got -1). appId", y(str), "first_open_count");
                        return -1L;
                    }
                    F2 = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + F2));
                    if (B2.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        f().A.h("Failed to update column (got 0). appId", y(str), "first_open_count");
                        return -1L;
                    }
                    B2.setTransactionSuccessful();
                    return F2;
                } catch (SQLiteException e) {
                    e = e;
                    j10 = F2;
                    f().A.i("Error inserting column. appId", y(str), "first_open_count", e);
                    return j10;
                }
            } catch (SQLiteException e8) {
                e = e8;
            }
        } finally {
            B2.endTransaction();
        }
    }

    public final long h0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = B().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j10 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j10;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                f().A.h("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
    
        f().A.f(java.lang.Integer.valueOf(com.facebook.ads.AdError.NETWORK_ERROR_CODE), "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List i0(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.i.i0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void j0(String str, o1 o1Var) {
        fa.y.h(str);
        fa.y.h(o1Var);
        u();
        y();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", o1Var.o());
        contentValues.put("consent_source", Integer.valueOf(o1Var.f16285b));
        P(contentValues);
    }

    public final void k0(String str, ArrayList arrayList) {
        fa.y.e(str);
        y();
        u();
        SQLiteDatabase B2 = B();
        try {
            long h02 = h0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(AdError.SERVER_ERROR_CODE, ((d1) this.f3443v).A.z(str, v.F)));
            if (h02 > max) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    Integer num = (Integer) arrayList.get(i);
                    if (num == null) {
                        return;
                    }
                    arrayList2.add(Integer.toString(num.intValue()));
                }
                B2.delete("audience_filter_values", a.k("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", a.k("(", TextUtils.join(",", arrayList2), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(max)});
            }
        } catch (SQLiteException e) {
            f().A.h("Database error querying filters. appId", y(str), e);
        }
    }

    public final long l0(String str) {
        fa.y.e(str);
        u();
        y();
        return F("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    public final long m0(String str) {
        fa.y.e(str);
        return F("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0059: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:90), block:B:38:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final eb.d n0(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.i.n0(java.lang.String, java.lang.String):eb.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final eb.p o0(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.i.o0(java.lang.String, java.lang.String, java.lang.String):eb.p");
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b2: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:179), block:B:144:0x00b2 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038b A[Catch: all -> 0x00b1, SQLiteException -> 0x00b5, TryCatch #0 {all -> 0x00b1, blocks: (B:5:0x0083, B:10:0x008d, B:13:0x00a6, B:16:0x00bf, B:18:0x00d2, B:20:0x00e6, B:22:0x0128, B:26:0x0132, B:29:0x017c, B:31:0x01ab, B:35:0x01b5, B:38:0x01c6, B:41:0x01e3, B:43:0x01ee, B:44:0x0200, B:46:0x020b, B:48:0x0231, B:50:0x023e, B:52:0x0247, B:54:0x024f, B:57:0x0258, B:60:0x0269, B:62:0x0281, B:65:0x0298, B:69:0x029d, B:71:0x02bc, B:74:0x02d3, B:76:0x02e1, B:78:0x02ee, B:80:0x02f6, B:83:0x02ff, B:86:0x0310, B:89:0x0315, B:92:0x032c, B:94:0x0361, B:97:0x036b, B:100:0x037c, B:102:0x0381, B:104:0x038b, B:106:0x0393, B:107:0x03b1, B:109:0x03b9, B:110:0x03d7, B:112:0x03e4, B:115:0x03fa, B:117:0x03ff, B:119:0x040f, B:123:0x031f, B:126:0x0328, B:128:0x0215, B:129:0x01df, B:132:0x0177, B:134:0x00de, B:135:0x00b8, B:138:0x0426), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03e4 A[Catch: all -> 0x00b1, SQLiteException -> 0x00b5, TryCatch #0 {all -> 0x00b1, blocks: (B:5:0x0083, B:10:0x008d, B:13:0x00a6, B:16:0x00bf, B:18:0x00d2, B:20:0x00e6, B:22:0x0128, B:26:0x0132, B:29:0x017c, B:31:0x01ab, B:35:0x01b5, B:38:0x01c6, B:41:0x01e3, B:43:0x01ee, B:44:0x0200, B:46:0x020b, B:48:0x0231, B:50:0x023e, B:52:0x0247, B:54:0x024f, B:57:0x0258, B:60:0x0269, B:62:0x0281, B:65:0x0298, B:69:0x029d, B:71:0x02bc, B:74:0x02d3, B:76:0x02e1, B:78:0x02ee, B:80:0x02f6, B:83:0x02ff, B:86:0x0310, B:89:0x0315, B:92:0x032c, B:94:0x0361, B:97:0x036b, B:100:0x037c, B:102:0x0381, B:104:0x038b, B:106:0x0393, B:107:0x03b1, B:109:0x03b9, B:110:0x03d7, B:112:0x03e4, B:115:0x03fa, B:117:0x03ff, B:119:0x040f, B:123:0x031f, B:126:0x0328, B:128:0x0215, B:129:0x01df, B:132:0x0177, B:134:0x00de, B:135:0x00b8, B:138:0x0426), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x040f A[Catch: all -> 0x00b1, SQLiteException -> 0x00b5, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:5:0x0083, B:10:0x008d, B:13:0x00a6, B:16:0x00bf, B:18:0x00d2, B:20:0x00e6, B:22:0x0128, B:26:0x0132, B:29:0x017c, B:31:0x01ab, B:35:0x01b5, B:38:0x01c6, B:41:0x01e3, B:43:0x01ee, B:44:0x0200, B:46:0x020b, B:48:0x0231, B:50:0x023e, B:52:0x0247, B:54:0x024f, B:57:0x0258, B:60:0x0269, B:62:0x0281, B:65:0x0298, B:69:0x029d, B:71:0x02bc, B:74:0x02d3, B:76:0x02e1, B:78:0x02ee, B:80:0x02f6, B:83:0x02ff, B:86:0x0310, B:89:0x0315, B:92:0x032c, B:94:0x0361, B:97:0x036b, B:100:0x037c, B:102:0x0381, B:104:0x038b, B:106:0x0393, B:107:0x03b1, B:109:0x03b9, B:110:0x03d7, B:112:0x03e4, B:115:0x03fa, B:117:0x03ff, B:119:0x040f, B:123:0x031f, B:126:0x0328, B:128:0x0215, B:129:0x01df, B:132:0x0177, B:134:0x00de, B:135:0x00b8, B:138:0x0426), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x031f A[Catch: all -> 0x00b1, SQLiteException -> 0x00b5, TryCatch #0 {all -> 0x00b1, blocks: (B:5:0x0083, B:10:0x008d, B:13:0x00a6, B:16:0x00bf, B:18:0x00d2, B:20:0x00e6, B:22:0x0128, B:26:0x0132, B:29:0x017c, B:31:0x01ab, B:35:0x01b5, B:38:0x01c6, B:41:0x01e3, B:43:0x01ee, B:44:0x0200, B:46:0x020b, B:48:0x0231, B:50:0x023e, B:52:0x0247, B:54:0x024f, B:57:0x0258, B:60:0x0269, B:62:0x0281, B:65:0x0298, B:69:0x029d, B:71:0x02bc, B:74:0x02d3, B:76:0x02e1, B:78:0x02ee, B:80:0x02f6, B:83:0x02ff, B:86:0x0310, B:89:0x0315, B:92:0x032c, B:94:0x0361, B:97:0x036b, B:100:0x037c, B:102:0x0381, B:104:0x038b, B:106:0x0393, B:107:0x03b1, B:109:0x03b9, B:110:0x03d7, B:112:0x03e4, B:115:0x03fa, B:117:0x03ff, B:119:0x040f, B:123:0x031f, B:126:0x0328, B:128:0x0215, B:129:0x01df, B:132:0x0177, B:134:0x00de, B:135:0x00b8, B:138:0x0426), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01df A[Catch: all -> 0x00b1, SQLiteException -> 0x00b5, TryCatch #0 {all -> 0x00b1, blocks: (B:5:0x0083, B:10:0x008d, B:13:0x00a6, B:16:0x00bf, B:18:0x00d2, B:20:0x00e6, B:22:0x0128, B:26:0x0132, B:29:0x017c, B:31:0x01ab, B:35:0x01b5, B:38:0x01c6, B:41:0x01e3, B:43:0x01ee, B:44:0x0200, B:46:0x020b, B:48:0x0231, B:50:0x023e, B:52:0x0247, B:54:0x024f, B:57:0x0258, B:60:0x0269, B:62:0x0281, B:65:0x0298, B:69:0x029d, B:71:0x02bc, B:74:0x02d3, B:76:0x02e1, B:78:0x02ee, B:80:0x02f6, B:83:0x02ff, B:86:0x0310, B:89:0x0315, B:92:0x032c, B:94:0x0361, B:97:0x036b, B:100:0x037c, B:102:0x0381, B:104:0x038b, B:106:0x0393, B:107:0x03b1, B:109:0x03b9, B:110:0x03d7, B:112:0x03e4, B:115:0x03fa, B:117:0x03ff, B:119:0x040f, B:123:0x031f, B:126:0x0328, B:128:0x0215, B:129:0x01df, B:132:0x0177, B:134:0x00de, B:135:0x00b8, B:138:0x0426), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0177 A[Catch: all -> 0x00b1, SQLiteException -> 0x00b5, TryCatch #0 {all -> 0x00b1, blocks: (B:5:0x0083, B:10:0x008d, B:13:0x00a6, B:16:0x00bf, B:18:0x00d2, B:20:0x00e6, B:22:0x0128, B:26:0x0132, B:29:0x017c, B:31:0x01ab, B:35:0x01b5, B:38:0x01c6, B:41:0x01e3, B:43:0x01ee, B:44:0x0200, B:46:0x020b, B:48:0x0231, B:50:0x023e, B:52:0x0247, B:54:0x024f, B:57:0x0258, B:60:0x0269, B:62:0x0281, B:65:0x0298, B:69:0x029d, B:71:0x02bc, B:74:0x02d3, B:76:0x02e1, B:78:0x02ee, B:80:0x02f6, B:83:0x02ff, B:86:0x0310, B:89:0x0315, B:92:0x032c, B:94:0x0361, B:97:0x036b, B:100:0x037c, B:102:0x0381, B:104:0x038b, B:106:0x0393, B:107:0x03b1, B:109:0x03b9, B:110:0x03d7, B:112:0x03e4, B:115:0x03fa, B:117:0x03ff, B:119:0x040f, B:123:0x031f, B:126:0x0328, B:128:0x0215, B:129:0x01df, B:132:0x0177, B:134:0x00de, B:135:0x00b8, B:138:0x0426), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ab A[Catch: all -> 0x00b1, SQLiteException -> 0x00b5, TryCatch #0 {all -> 0x00b1, blocks: (B:5:0x0083, B:10:0x008d, B:13:0x00a6, B:16:0x00bf, B:18:0x00d2, B:20:0x00e6, B:22:0x0128, B:26:0x0132, B:29:0x017c, B:31:0x01ab, B:35:0x01b5, B:38:0x01c6, B:41:0x01e3, B:43:0x01ee, B:44:0x0200, B:46:0x020b, B:48:0x0231, B:50:0x023e, B:52:0x0247, B:54:0x024f, B:57:0x0258, B:60:0x0269, B:62:0x0281, B:65:0x0298, B:69:0x029d, B:71:0x02bc, B:74:0x02d3, B:76:0x02e1, B:78:0x02ee, B:80:0x02f6, B:83:0x02ff, B:86:0x0310, B:89:0x0315, B:92:0x032c, B:94:0x0361, B:97:0x036b, B:100:0x037c, B:102:0x0381, B:104:0x038b, B:106:0x0393, B:107:0x03b1, B:109:0x03b9, B:110:0x03d7, B:112:0x03e4, B:115:0x03fa, B:117:0x03ff, B:119:0x040f, B:123:0x031f, B:126:0x0328, B:128:0x0215, B:129:0x01df, B:132:0x0177, B:134:0x00de, B:135:0x00b8, B:138:0x0426), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ee A[Catch: all -> 0x00b1, SQLiteException -> 0x00b5, TryCatch #0 {all -> 0x00b1, blocks: (B:5:0x0083, B:10:0x008d, B:13:0x00a6, B:16:0x00bf, B:18:0x00d2, B:20:0x00e6, B:22:0x0128, B:26:0x0132, B:29:0x017c, B:31:0x01ab, B:35:0x01b5, B:38:0x01c6, B:41:0x01e3, B:43:0x01ee, B:44:0x0200, B:46:0x020b, B:48:0x0231, B:50:0x023e, B:52:0x0247, B:54:0x024f, B:57:0x0258, B:60:0x0269, B:62:0x0281, B:65:0x0298, B:69:0x029d, B:71:0x02bc, B:74:0x02d3, B:76:0x02e1, B:78:0x02ee, B:80:0x02f6, B:83:0x02ff, B:86:0x0310, B:89:0x0315, B:92:0x032c, B:94:0x0361, B:97:0x036b, B:100:0x037c, B:102:0x0381, B:104:0x038b, B:106:0x0393, B:107:0x03b1, B:109:0x03b9, B:110:0x03d7, B:112:0x03e4, B:115:0x03fa, B:117:0x03ff, B:119:0x040f, B:123:0x031f, B:126:0x0328, B:128:0x0215, B:129:0x01df, B:132:0x0177, B:134:0x00de, B:135:0x00b8, B:138:0x0426), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x020b A[Catch: all -> 0x00b1, SQLiteException -> 0x00b5, TryCatch #0 {all -> 0x00b1, blocks: (B:5:0x0083, B:10:0x008d, B:13:0x00a6, B:16:0x00bf, B:18:0x00d2, B:20:0x00e6, B:22:0x0128, B:26:0x0132, B:29:0x017c, B:31:0x01ab, B:35:0x01b5, B:38:0x01c6, B:41:0x01e3, B:43:0x01ee, B:44:0x0200, B:46:0x020b, B:48:0x0231, B:50:0x023e, B:52:0x0247, B:54:0x024f, B:57:0x0258, B:60:0x0269, B:62:0x0281, B:65:0x0298, B:69:0x029d, B:71:0x02bc, B:74:0x02d3, B:76:0x02e1, B:78:0x02ee, B:80:0x02f6, B:83:0x02ff, B:86:0x0310, B:89:0x0315, B:92:0x032c, B:94:0x0361, B:97:0x036b, B:100:0x037c, B:102:0x0381, B:104:0x038b, B:106:0x0393, B:107:0x03b1, B:109:0x03b9, B:110:0x03d7, B:112:0x03e4, B:115:0x03fa, B:117:0x03ff, B:119:0x040f, B:123:0x031f, B:126:0x0328, B:128:0x0215, B:129:0x01df, B:132:0x0177, B:134:0x00de, B:135:0x00b8, B:138:0x0426), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x023e A[Catch: all -> 0x00b1, SQLiteException -> 0x00b5, TryCatch #0 {all -> 0x00b1, blocks: (B:5:0x0083, B:10:0x008d, B:13:0x00a6, B:16:0x00bf, B:18:0x00d2, B:20:0x00e6, B:22:0x0128, B:26:0x0132, B:29:0x017c, B:31:0x01ab, B:35:0x01b5, B:38:0x01c6, B:41:0x01e3, B:43:0x01ee, B:44:0x0200, B:46:0x020b, B:48:0x0231, B:50:0x023e, B:52:0x0247, B:54:0x024f, B:57:0x0258, B:60:0x0269, B:62:0x0281, B:65:0x0298, B:69:0x029d, B:71:0x02bc, B:74:0x02d3, B:76:0x02e1, B:78:0x02ee, B:80:0x02f6, B:83:0x02ff, B:86:0x0310, B:89:0x0315, B:92:0x032c, B:94:0x0361, B:97:0x036b, B:100:0x037c, B:102:0x0381, B:104:0x038b, B:106:0x0393, B:107:0x03b1, B:109:0x03b9, B:110:0x03d7, B:112:0x03e4, B:115:0x03fa, B:117:0x03ff, B:119:0x040f, B:123:0x031f, B:126:0x0328, B:128:0x0215, B:129:0x01df, B:132:0x0177, B:134:0x00de, B:135:0x00b8, B:138:0x0426), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02bc A[Catch: all -> 0x00b1, SQLiteException -> 0x00b5, TryCatch #0 {all -> 0x00b1, blocks: (B:5:0x0083, B:10:0x008d, B:13:0x00a6, B:16:0x00bf, B:18:0x00d2, B:20:0x00e6, B:22:0x0128, B:26:0x0132, B:29:0x017c, B:31:0x01ab, B:35:0x01b5, B:38:0x01c6, B:41:0x01e3, B:43:0x01ee, B:44:0x0200, B:46:0x020b, B:48:0x0231, B:50:0x023e, B:52:0x0247, B:54:0x024f, B:57:0x0258, B:60:0x0269, B:62:0x0281, B:65:0x0298, B:69:0x029d, B:71:0x02bc, B:74:0x02d3, B:76:0x02e1, B:78:0x02ee, B:80:0x02f6, B:83:0x02ff, B:86:0x0310, B:89:0x0315, B:92:0x032c, B:94:0x0361, B:97:0x036b, B:100:0x037c, B:102:0x0381, B:104:0x038b, B:106:0x0393, B:107:0x03b1, B:109:0x03b9, B:110:0x03d7, B:112:0x03e4, B:115:0x03fa, B:117:0x03ff, B:119:0x040f, B:123:0x031f, B:126:0x0328, B:128:0x0215, B:129:0x01df, B:132:0x0177, B:134:0x00de, B:135:0x00b8, B:138:0x0426), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ee A[Catch: all -> 0x00b1, SQLiteException -> 0x00b5, TryCatch #0 {all -> 0x00b1, blocks: (B:5:0x0083, B:10:0x008d, B:13:0x00a6, B:16:0x00bf, B:18:0x00d2, B:20:0x00e6, B:22:0x0128, B:26:0x0132, B:29:0x017c, B:31:0x01ab, B:35:0x01b5, B:38:0x01c6, B:41:0x01e3, B:43:0x01ee, B:44:0x0200, B:46:0x020b, B:48:0x0231, B:50:0x023e, B:52:0x0247, B:54:0x024f, B:57:0x0258, B:60:0x0269, B:62:0x0281, B:65:0x0298, B:69:0x029d, B:71:0x02bc, B:74:0x02d3, B:76:0x02e1, B:78:0x02ee, B:80:0x02f6, B:83:0x02ff, B:86:0x0310, B:89:0x0315, B:92:0x032c, B:94:0x0361, B:97:0x036b, B:100:0x037c, B:102:0x0381, B:104:0x038b, B:106:0x0393, B:107:0x03b1, B:109:0x03b9, B:110:0x03d7, B:112:0x03e4, B:115:0x03fa, B:117:0x03ff, B:119:0x040f, B:123:0x031f, B:126:0x0328, B:128:0x0215, B:129:0x01df, B:132:0x0177, B:134:0x00de, B:135:0x00b8, B:138:0x0426), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0361 A[Catch: all -> 0x00b1, SQLiteException -> 0x00b5, TryCatch #0 {all -> 0x00b1, blocks: (B:5:0x0083, B:10:0x008d, B:13:0x00a6, B:16:0x00bf, B:18:0x00d2, B:20:0x00e6, B:22:0x0128, B:26:0x0132, B:29:0x017c, B:31:0x01ab, B:35:0x01b5, B:38:0x01c6, B:41:0x01e3, B:43:0x01ee, B:44:0x0200, B:46:0x020b, B:48:0x0231, B:50:0x023e, B:52:0x0247, B:54:0x024f, B:57:0x0258, B:60:0x0269, B:62:0x0281, B:65:0x0298, B:69:0x029d, B:71:0x02bc, B:74:0x02d3, B:76:0x02e1, B:78:0x02ee, B:80:0x02f6, B:83:0x02ff, B:86:0x0310, B:89:0x0315, B:92:0x032c, B:94:0x0361, B:97:0x036b, B:100:0x037c, B:102:0x0381, B:104:0x038b, B:106:0x0393, B:107:0x03b1, B:109:0x03b9, B:110:0x03d7, B:112:0x03e4, B:115:0x03fa, B:117:0x03ff, B:119:0x040f, B:123:0x031f, B:126:0x0328, B:128:0x0215, B:129:0x01df, B:132:0x0177, B:134:0x00de, B:135:0x00b8, B:138:0x0426), top: B:2:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final eb.n0 p0(java.lang.String r52) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.i.p0(java.lang.String):eb.n0");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final eb.m3 q0(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            fa.y.e(r11)
            fa.y.e(r12)
            r10.u()
            r10.y()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.B()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.lang.String r3 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L34
            r2.close()
            return r1
        L34:
            r0 = 0
            long r7 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L71
            r0 = 1
            java.lang.Object r9 = r10.H(r2, r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L71
            if (r9 != 0) goto L44
            r2.close()
            return r1
        L44:
            r0 = 2
            java.lang.String r5 = r2.getString(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L71
            eb.m3 r3 = new eb.m3     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L71
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            boolean r11 = r2.moveToNext()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            if (r11 == 0) goto L6d
            eb.k0 r11 = r10.f()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            com.google.android.gms.internal.ads.js r11 = r11.A     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r12 = "Got multiple records for user property, expected one. appId"
            eb.l0 r0 = eb.y(r4)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            r11.f(r0, r12)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            goto L6d
        L66:
            r0 = move-exception
            r11 = r0
            r1 = r2
            goto L9c
        L6a:
            r0 = move-exception
        L6b:
            r11 = r0
            goto L7d
        L6d:
            r2.close()
            return r3
        L71:
            r0 = move-exception
            r4 = r11
            r6 = r12
            goto L6b
        L75:
            r0 = move-exception
            r11 = r0
            goto L9c
        L78:
            r0 = move-exception
            r4 = r11
            r6 = r12
            r11 = r0
            r2 = r1
        L7d:
            eb.k0 r12 = r10.f()     // Catch: java.lang.Throwable -> L66
            com.google.android.gms.internal.ads.js r12 = r12.A     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "Error querying user property. appId"
            eb.l0 r3 = eb.y(r4)     // Catch: java.lang.Throwable -> L66
            java.lang.Object r4 = r10.f3443v     // Catch: java.lang.Throwable -> L66
            eb.d1 r4 = (eb.d1) r4     // Catch: java.lang.Throwable -> L66
            eb.h0 r4 = r4.G     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = r4.g(r6)     // Catch: java.lang.Throwable -> L66
            r12.i(r0, r3, r4, r11)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L9b
            r2.close()
        L9b:
            return r1
        L9c:
            if (r1 == 0) goto La1
            r1.close()
        La1:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.i.q0(java.lang.String, java.lang.String):eb.m3");
    }

    public final o1 r0(String str) {
        fa.y.h(str);
        u();
        y();
        return o1.e(100, J("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final void s0(String str, String str2) {
        fa.y.e(str);
        fa.y.e(str2);
        u();
        y();
        try {
            B().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            f().A.i("Error deleting user property. appId", y(str), ((d1) this.f3443v).G.g(str2), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final eb.o1 t0(java.lang.String r5) {
        /*
            r4 = this;
            fa.y.h(r5)
            r4.u()
            r4.y()
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.B()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            android.database.Cursor r5 = r2.rawQuery(r0, r5)     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            if (r0 != 0) goto L32
            eb.k0 r0 = r4.f()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            com.google.android.gms.internal.ads.js r0 = r0.I     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            java.lang.String r2 = "No data found"
            g(r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r5.close()
            goto L58
        L2d:
            r0 = move-exception
            r1 = r5
            goto L5e
        L30:
            r0 = move-exception
            goto L48
        L32:
            r0 = 0
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r2 = 1
            int r2 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            eb.o1 r1 = eb.o1.e(r2, r0)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r5.close()
            goto L58
        L44:
            r0 = move-exception
            goto L5e
        L46:
            r0 = move-exception
            r5 = r1
        L48:
            eb.k0 r2 = r4.f()     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.js r2 = r2.A     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "Error querying database."
            f(r0, r3)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L58
            r5.close()
        L58:
            if (r1 != 0) goto L5d
            eb.o1 r5 = eb.o1.f16283c
            return r5
        L5d:
            return r1
        L5e:
            if (r1 == 0) goto L63
            r1.close()
        L63:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.i.t0(java.lang.String):eb.o1");
    }

    public final void u0(String str, String str2) {
        fa.y.e(str2);
        u();
        y();
        try {
            B().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            f().A.h("Error deleting snapshot. appId", y(str2), e);
        }
    }

    public final List v0(String str) {
        String str2;
        fa.y.e(str);
        u();
        y();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = B().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                while (true) {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str3 = string2;
                    long j10 = cursor.getLong(2);
                    Object H2 = H(cursor, 3);
                    if (H2 == null) {
                        f().A.f(y(str), "Read invalid user property value, ignoring it. appId");
                        str2 = str;
                    } else {
                        str2 = str;
                        try {
                            arrayList.add(new m3(str2, str3, string, j10, H2));
                        } catch (SQLiteException e) {
                            e = e;
                            f().A.h("Error querying user properties. appId", y(str2), e);
                            List list = Collections.EMPTY_LIST;
                            if (cursor != null) {
                                cursor.close();
                            }
                            return list;
                        }
                    }
                    if (!cursor.moveToNext()) {
                        cursor.close();
                        return arrayList;
                    }
                    str = str2;
                }
            } finally {
            }
        } catch (SQLiteException e8) {
            e = e8;
            str2 = str;
        }
    }

    public final void w0(String str) {
        p o02;
        u0("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = B().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return;
                }
                do {
                    String string = cursor.getString(0);
                    if (string != null && (o02 = o0("events", str, string)) != null) {
                        T("events_snapshot", o02);
                    }
                } while (cursor.moveToNext());
                cursor.close();
            } catch (SQLiteException e) {
                f().A.h("Error creating snapshot. appId", y(str), e);
                if (cursor != null) {
                    cursor.close();
                }
            }
        } finally {
        }
    }

    public final void x0() {
        y();
        B().beginTransaction();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if ("_v".equals(r0) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y0(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.i.y0(java.lang.String):void");
    }

    public final void z0() {
        y();
        B().endTransaction();
    }
}