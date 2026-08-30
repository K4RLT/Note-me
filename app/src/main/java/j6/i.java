package j6;
import j.i0;
import q.a0;
import q.n1;
import q.q;
import q.r;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import c0.z;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.i8;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.t3;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.internal.measurement.y4;
import com.google.android.play.core.hsdp.service.HsdpShimActivity;
import eb.d1;
import eb.q0;
import fa.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import lb.r1;
import lb.v;
import n.p0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q.q1;
import q.x;
import ya.b0;
import ya.c0;
import ya.ma;

/* loaded from: classes.dex */
public final class i implements mb.f, q1, qb.a, p8.b {

    /* renamed from: u, reason: collision with root package name */
    public Object f18924u;

    /* renamed from: v, reason: collision with root package name */
    public Object f18925v;

    /* renamed from: w, reason: collision with root package name */
    public Object f18926w;

    /* renamed from: x, reason: collision with root package name */
    public Object f18927x;

    /* JADX WARN: Type inference failed for: r4v1, types: [j6.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.google.android.gms.internal.measurement.o5] */
    public i(int i) {
        switch (i) {
            case 4:
                Object obj = new Object();
                obj.f18918u = new HashMap();
                obj.f18919v = new com.google.android.gms.internal.measurement.s(6);
                com.google.android.gms.internal.measurement.s sVar = new com.google.android.gms.internal.measurement.s(0);
                e0 e0Var = e0.BITWISE_AND;
                ArrayList arrayList = sVar.f13905a;
                arrayList.add(e0Var);
                arrayList.add(e0.BITWISE_LEFT_SHIFT);
                arrayList.add(e0.BITWISE_NOT);
                arrayList.add(e0.BITWISE_OR);
                arrayList.add(e0.BITWISE_RIGHT_SHIFT);
                arrayList.add(e0.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(e0.BITWISE_XOR);
                obj.n(sVar);
                com.google.android.gms.internal.measurement.s sVar2 = new com.google.android.gms.internal.measurement.s(1);
                e0 e0Var2 = e0.EQUALS;
                ArrayList arrayList2 = sVar2.f13905a;
                arrayList2.add(e0Var2);
                arrayList2.add(e0.GREATER_THAN);
                arrayList2.add(e0.GREATER_THAN_EQUALS);
                arrayList2.add(e0.IDENTITY_EQUALS);
                arrayList2.add(e0.IDENTITY_NOT_EQUALS);
                arrayList2.add(e0.LESS_THAN);
                arrayList2.add(e0.LESS_THAN_EQUALS);
                arrayList2.add(e0.NOT_EQUALS);
                obj.n(sVar2);
                com.google.android.gms.internal.measurement.s sVar3 = new com.google.android.gms.internal.measurement.s(2);
                e0 e0Var3 = e0.APPLY;
                ArrayList arrayList3 = sVar3.f13905a;
                arrayList3.add(e0Var3);
                arrayList3.add(e0.BLOCK);
                arrayList3.add(e0.BREAK);
                arrayList3.add(e0.CASE);
                arrayList3.add(e0.DEFAULT);
                arrayList3.add(e0.CONTINUE);
                arrayList3.add(e0.DEFINE_FUNCTION);
                arrayList3.add(e0.FN);
                arrayList3.add(e0.IF);
                arrayList3.add(e0.QUOTE);
                arrayList3.add(e0.RETURN);
                arrayList3.add(e0.SWITCH);
                arrayList3.add(e0.TERNARY);
                obj.n(sVar3);
                com.google.android.gms.internal.measurement.s sVar4 = new com.google.android.gms.internal.measurement.s(3);
                e0 e0Var4 = e0.AND;
                ArrayList arrayList4 = sVar4.f13905a;
                arrayList4.add(e0Var4);
                arrayList4.add(e0.NOT);
                arrayList4.add(e0.OR);
                obj.n(sVar4);
                com.google.android.gms.internal.measurement.s sVar5 = new com.google.android.gms.internal.measurement.s(4);
                e0 e0Var5 = e0.FOR_IN;
                ArrayList arrayList5 = sVar5.f13905a;
                arrayList5.add(e0Var5);
                arrayList5.add(e0.FOR_IN_CONST);
                arrayList5.add(e0.FOR_IN_LET);
                arrayList5.add(e0.FOR_LET);
                arrayList5.add(e0.FOR_OF);
                arrayList5.add(e0.FOR_OF_CONST);
                arrayList5.add(e0.FOR_OF_LET);
                arrayList5.add(e0.WHILE);
                obj.n(sVar5);
                com.google.android.gms.internal.measurement.s sVar6 = new com.google.android.gms.internal.measurement.s(5);
                e0 e0Var6 = e0.ADD;
                ArrayList arrayList6 = sVar6.f13905a;
                arrayList6.add(e0Var6);
                arrayList6.add(e0.DIVIDE);
                arrayList6.add(e0.MODULUS);
                arrayList6.add(e0.MULTIPLY);
                arrayList6.add(e0.NEGATE);
                arrayList6.add(e0.POST_DECREMENT);
                arrayList6.add(e0.POST_INCREMENT);
                arrayList6.add(e0.PRE_DECREMENT);
                arrayList6.add(e0.PRE_INCREMENT);
                arrayList6.add(e0.SUBTRACT);
                obj.n(sVar6);
                com.google.android.gms.internal.measurement.s sVar7 = new com.google.android.gms.internal.measurement.s(7);
                e0 e0Var7 = e0.ASSIGN;
                ArrayList arrayList7 = sVar7.f13905a;
                arrayList7.add(e0Var7);
                arrayList7.add(e0.CONST);
                arrayList7.add(e0.CREATE_ARRAY);
                arrayList7.add(e0.CREATE_OBJECT);
                arrayList7.add(e0.EXPRESSION_LIST);
                arrayList7.add(e0.GET);
                arrayList7.add(e0.GET_INDEX);
                arrayList7.add(e0.GET_PROPERTY);
                arrayList7.add(e0.NULL);
                arrayList7.add(e0.SET_PROPERTY);
                arrayList7.add(e0.TYPEOF);
                arrayList7.add(e0.UNDEFINED);
                arrayList7.add(e0.VAR);
                obj.n(sVar7);
                this.f18924u = obj;
                n nVar = new n((n) null, (e) obj);
                this.f18926w = nVar;
                this.f18925v = nVar.u();
                Object obj2 = new Object();
                HashMap hashMap = new HashMap();
                obj2.f13873u = hashMap;
                this.f18927x = obj2;
                nVar.y("require", new i8(obj2));
                hashMap.put("internal.platform", new Object());
                nVar.y("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(0.0d)));
                return;
            default:
                this.f18924u = new Object();
                long[] jArr = p0.f20923a;
                this.f18925v = new i0();
                return;
        }
    }

    public static final Message c(i iVar, ArrayList arrayList, int i) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            if (((Message) obj2).what == i) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        }
        return (Message) obj;
    }

    @Override // qb.a
    public void K(Bundle bundle) {
        Log.e("HsdpShimActivity", "HSDP service based UI error: " + String.valueOf(bundle) + ". Finish the shim activity.");
        String str = (String) this.f18924u;
        String str2 = (String) this.f18925v;
        Map map = (Map) this.f18926w;
        HsdpShimActivity hsdpShimActivity = (HsdpShimActivity) this.f18927x;
        hsdpShimActivity.startActivityForResult(ma.a(str, str2, map), 0);
        hsdpShimActivity.f15584u = null;
        hsdpShimActivity.f15585v = false;
        hsdpShimActivity.finish();
    }

    @Override // qb.a
    public void N(Bundle bundle) {
        Log.i("HsdpShimActivity", "HSDP service based UI shown");
        ((HsdpShimActivity) this.f18927x).f15585v = true;
    }

    @Override // qb.a
    public void W(Bundle bundle) {
        HsdpShimActivity hsdpShimActivity = (HsdpShimActivity) this.f18927x;
        if (Log.isLoggable("HsdpShimActivity", 4)) {
            Log.i("HsdpShimActivity", "HSDP service based UI dismissed. hasBeenShown=" + hsdpShimActivity.f15585v);
        }
        boolean z3 = bundle.getBoolean("dldpRedirect", false);
        if (!hsdpShimActivity.f15585v && !z3) {
            Log.i("HsdpShimActivity", "Ignore dismiss before shown (likely temporary reuse cleanup)");
            return;
        }
        Log.i("HsdpShimActivity", "Finish the shim activity.");
        hsdpShimActivity.f15584u = null;
        hsdpShimActivity.finish();
    }

    @Override // mb.f
    public Object b() {
        return new lb.r(((c4.n) ((k6.i) this.f18924u).f19569v).f3851u, (v) ((mb.e) this.f18925v).b(), (r1) ((mb.e) this.f18926w).b(), (lb.i0) ((mb.e) this.f18927x).b());
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [c0.z, java.lang.Object] */
    public z d() {
        boolean z3;
        boolean z9;
        Object obj;
        ArrayList arrayList = (ArrayList) this.f18926w;
        boolean z10 = true;
        if (arrayList != null && !arrayList.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            ArrayList arrayList2 = (ArrayList) this.f18926w;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    if (((c7.e) obj2) == null) {
                        x.n("ProductDetailsParams cannot be null.");
                        return null;
                    }
                }
            }
            Object obj3 = new Object();
            if (z3 && !((c7.e) ((ArrayList) this.f18926w).get(0)).f3928a.f3962b.optString("packageName").isEmpty()) {
                z9 = true;
            } else {
                z9 = false;
            }
            obj3.f3436u = z9;
            obj3.f3437v = (String) this.f18924u;
            obj3.f3438w = (String) this.f18925v;
            ((de.b) this.f18927x).getClass();
            if (TextUtils.isEmpty(null) && TextUtils.isEmpty(null)) {
                z10 = false;
            }
            boolean isEmpty = TextUtils.isEmpty(null);
            if (z10 && !isEmpty) {
                x.n("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                return null;
            }
            obj3.f3439x = new ed.e(9);
            obj3.f3441z = new ArrayList();
            ArrayList arrayList3 = (ArrayList) this.f18926w;
            if (arrayList3 != null) {
                obj = com.google.android.gms.internal.play_billing.q(arrayList3);
            } else {
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f15518v;
                obj = com.google.android.gms.internal.play_billing.v.f15535y;
            }
            obj3.f3440y = obj;
            return obj3;
        }
        x.n("Details of the products must be provided.");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, b0.c] */
    public b0.c e(Object obj) {
        b0.c cVar = (b0.c) this.f18927x;
        if (this.f18926w == obj && cVar != null) {
            return cVar;
        }
        i0 i0Var = (i0) this.f18925v;
        Object g8 = i0Var.g(obj);
        if (g8 == null) {
            b0.c cVar2 = (b0.c) this.f18924u;
            Object obj2 = new Object();
            obj2.f1160a = cVar2.f1160a;
            obj2.f1161b = cVar2.f1161b;
            i0Var.m(obj, obj2);
            g8 = obj2;
        }
        b0.c cVar3 = (b0.c) g8;
        this.f18926w = obj;
        this.f18927x = cVar3;
        return cVar3;
    }

    @Override // n1
    public long f(q qVar, q qVar2, q qVar3) {
        int b10 = qVar.b();
        long j10 = 0;
        for (int i = 0; i < b10; i++) {
            j10 = Math.max(j10, ((r) this.f18924u).get(i).c(qVar.a(i), qVar2.a(i), qVar3.a(i)));
        }
        return j10;
    }

    public g g(j jVar) {
        String str = jVar.f18928a;
        int i = jVar.f18929b;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f18924u;
        a0 k3 = a0.k(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        if (str == null) {
            k3.g(1);
        } else {
            k3.n(1, str);
        }
        k3.b(2, i);
        workDatabase_Impl.b();
        Cursor d2 = c0.d(workDatabase_Impl, k3, false);
        try {
            int a10 = b0.a(d2, "work_spec_id");
            int a11 = b0.a(d2, "generation");
            int a12 = b0.a(d2, "system_id");
            g gVar = null;
            String string = null;
            if (d2.moveToFirst()) {
                if (!d2.isNull(a10)) {
                    string = d2.getString(a10);
                }
                gVar = new g(string, d2.getInt(a11), d2.getInt(a12));
            }
            return gVar;
        } finally {
            d2.close();
            k3.m();
        }
    }

    @Override // oe.a
    public Object get() {
        return new nd.o((Executor) ((oe.a) this.f18924u).get(), (u8.f) ((oe.a) this.f18925v).get(), (i0) ((i0) this.f18926w).get(), (u8.f) ((oe.a) this.f18927x).get());
    }

    public void h(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f18924u;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f18925v).i(gVar);
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.h();
        }
    }

    @Override // n1
    public q i(long j10, q qVar, q qVar2, q qVar3) {
        if (((q) this.f18925v) == null) {
            this.f18925v = qVar.c();
        }
        q qVar4 = (q) this.f18925v;
        if (qVar4 != null) {
            int b10 = qVar4.b();
            int i = 0;
            while (true) {
                q qVar5 = (q) this.f18925v;
                if (i < b10) {
                    if (qVar5 != null) {
                        qVar5.e(i, ((r) this.f18924u).get(i).e(j10, qVar.a(i), qVar2.a(i), qVar3.a(i)));
                        i++;
                    } else {
                        kotlin.jvm.internal.l.h("valueVector");
                        throw null;
                    }
                } else {
                    if (qVar5 != null) {
                        return qVar5;
                    }
                    kotlin.jvm.internal.l.h("valueVector");
                    throw null;
                }
            }
        } else {
            kotlin.jvm.internal.l.h("valueVector");
            throw null;
        }
    }

    public void j(y3.l lVar) {
        Object e = ((rf.h) this.f18926w).e(lVar);
        if (e instanceof rf.m) {
            Throwable th = ((rf.m) e).f24811a;
            if (th == null) {
                throw new IllegalStateException("Channel was closed normally");
            }
            throw th;
        }
        if (!(e instanceof rf.n)) {
            if (((AtomicInteger) this.f18927x).getAndIncrement() == 0) {
                pf.b0.x((pf.z) this.f18924u, null, new l5.a(this, null, 24), 3);
                return;
            }
            return;
        }
        x.o("Check failed.");
    }

    public void k(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.f18926w;
        if (linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    public void l(int i) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f18926w).drainTo(arrayList);
        Message obtain = Message.obtain(null, i, 0, 0);
        obtain.getClass();
        arrayList.add(obtain);
        pf.b0.x(pf.b0.b((te.g) this.f18924u), null, new l5.a(this, arrayList, null, 19), 3);
    }

    @Override // n1
    public q m(long j10, q qVar, q qVar2, q qVar3) {
        if (((q) this.f18926w) == null) {
            this.f18926w = qVar3.c();
        }
        q qVar4 = (q) this.f18926w;
        if (qVar4 != null) {
            int b10 = qVar4.b();
            int i = 0;
            while (true) {
                q qVar5 = (q) this.f18926w;
                if (i < b10) {
                    if (qVar5 != null) {
                        qVar5.e(i, ((r) this.f18924u).get(i).b(j10, qVar.a(i), qVar2.a(i), qVar3.a(i)));
                        i++;
                    } else {
                        kotlin.jvm.internal.l.h("velocityVector");
                        throw null;
                    }
                } else {
                    if (qVar5 != null) {
                        return qVar5;
                    }
                    kotlin.jvm.internal.l.h("velocityVector");
                    throw null;
                }
            }
        } else {
            kotlin.jvm.internal.l.h("velocityVector");
            throw null;
        }
    }

    public Bundle n() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        q0 q0Var = (q0) this.f18927x;
        d1 d1Var = (d1) q0Var.f3443v;
        if (((Bundle) this.f18926w) == null) {
            String string3 = q0Var.D().getString((String) this.f18924u, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i);
                            string = jSONObject.getString("n");
                            string2 = jSONObject.getString("t");
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            q0Var.f().A.g("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string2.equals("la")) {
                                            v7.a();
                                            if (d1Var.A.F(null, eb.v.f16436z0)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i10 = 0; i10 < length; i10++) {
                                                    jArr[i10] = jSONArray2.optLong(i10);
                                                }
                                                bundle.putLongArray(string, jArr);
                                            }
                                        }
                                    } else if (string2.equals("ia")) {
                                        v7.a();
                                        if (d1Var.A.F(null, eb.v.f16436z0)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i11 = 0; i11 < length2; i11++) {
                                                iArr[i11] = jSONArray3.optInt(i11);
                                            }
                                            bundle.putIntArray(string, iArr);
                                        }
                                    }
                                } else if (string2.equals("s")) {
                                    bundle.putString(string, jSONObject.getString("v"));
                                }
                            } else if (string2.equals("l")) {
                                bundle.putLong(string, Long.parseLong(jSONObject.getString("v")));
                            }
                        } else if (string2.equals("d")) {
                            bundle.putDouble(string, Double.parseDouble(jSONObject.getString("v")));
                        }
                        q0Var.f().A.f(string2, "Unrecognized persisted bundle type. Type");
                    }
                    this.f18926w = bundle;
                } catch (JSONException unused2) {
                    q0Var.f().A.g("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f18926w) == null) {
                this.f18926w = (Bundle) this.f18925v;
            }
        }
        return (Bundle) this.f18926w;
    }

    public com.google.android.gms.internal.measurement.n o(n nVar, t3... t3VarArr) {
        com.google.android.gms.internal.measurement.n nVar2 = com.google.android.gms.internal.measurement.n.f13848h;
        for (t3 t3Var : t3VarArr) {
            nVar2 = y4.c(t3Var);
            o0.h((n) this.f18926w);
            if ((nVar2 instanceof com.google.android.gms.internal.measurement.q) || (nVar2 instanceof com.google.android.gms.internal.measurement.o)) {
                nVar2 = ((e) this.f18924u).k(nVar, nVar2);
            }
        }
        return nVar2;
    }

    public void p(Bundle bundle) {
        q0 q0Var = (q0) this.f18927x;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = q0Var.D().edit();
        int size = bundle.size();
        String str = (String) this.f18924u;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        v7.a();
                        if (((d1) q0Var.f3443v).A.F(null, eb.v.f16436z0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "d");
                            } else {
                                q0Var.f().A.f(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        } else {
                            jSONObject.put("v", String.valueOf(obj));
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                q0Var.f().A.f(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        q0Var.f().A.f(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f18926w = bundle;
    }

    @Override // n1
    public q u(q qVar, q qVar2, q qVar3) {
        if (((q) this.f18927x) == null) {
            this.f18927x = qVar3.c();
        }
        q qVar4 = (q) this.f18927x;
        if (qVar4 != null) {
            int b10 = qVar4.b();
            int i = 0;
            while (true) {
                q qVar5 = (q) this.f18927x;
                if (i < b10) {
                    if (qVar5 != null) {
                        qVar5.e(i, ((r) this.f18924u).get(i).d(qVar.a(i), qVar2.a(i), qVar3.a(i)));
                        i++;
                    } else {
                        kotlin.jvm.internal.l.h("endVelocityVector");
                        throw null;
                    }
                } else {
                    if (qVar5 != null) {
                        return qVar5;
                    }
                    kotlin.jvm.internal.l.h("endVelocityVector");
                    throw null;
                }
            }
        } else {
            kotlin.jvm.internal.l.h("endVelocityVector");
            throw null;
        }
    }

    public i(q0 q0Var, String str) {
        this.f18927x = q0Var;
        y.e(str);
        this.f18924u = str;
        this.f18925v = new Bundle();
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f18924u = obj;
        this.f18925v = obj2;
        this.f18926w = obj3;
        this.f18927x = obj4;
    }

    public i(r rVar) {
        this.f18924u = rVar;
    }

    public i(a0 a0Var) {
        this(new ic.c(21, a0Var));
    }
}