package j6;
import d.b;
import f.a;

import android.os.Build;
import g5.v;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import wa.z8;

/* loaded from: classes.dex */
public final class b extends de.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18912d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v vVar) {
        super(vVar);
        this.f18912d = 1;
        vVar.getClass();
    }

    @Override // de.h
    public final String c() {
        switch (this.f18912d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public final void h(r5.j jVar, Object obj) {
        int i;
        int i10;
        byte[] byteArray;
        switch (this.f18912d) {
            case 0:
                a aVar = (a) obj;
                jVar.n(1, aVar.f18910a);
                String str = aVar.f18911b;
                if (str == null) {
                    jVar.g(2);
                    return;
                } else {
                    jVar.n(2, str);
                    return;
                }
            case 1:
                d dVar = (d) obj;
                jVar.n(1, dVar.f18916a);
                jVar.b(2, dVar.f18917b.longValue());
                return;
            case 2:
                String str2 = ((g) obj).f18920a;
                if (str2 == null) {
                    jVar.g(1);
                } else {
                    jVar.n(1, str2);
                }
                jVar.b(2, r2.f18921b);
                jVar.b(3, r2.f18922c);
                return;
            case 3:
                k kVar = (k) obj;
                String str3 = kVar.f18930a;
                if (str3 == null) {
                    jVar.g(1);
                } else {
                    jVar.n(1, str3);
                }
                jVar.n(2, kVar.f18931b);
                return;
            case 4:
                m mVar = (m) obj;
                String str4 = mVar.f18935a;
                if (str4 == null) {
                    jVar.g(1);
                } else {
                    jVar.n(1, str4);
                }
                byte[] c10 = a6.g.c(mVar.f18936b);
                if (c10 == null) {
                    jVar.g(2);
                    return;
                } else {
                    jVar.z(c10, 2);
                    return;
                }
            case 5:
                p pVar = (p) obj;
                String str5 = pVar.f18944a;
                int i11 = 1;
                if (str5 == null) {
                    jVar.g(1);
                } else {
                    jVar.n(1, str5);
                }
                jVar.b(2, z8.f(pVar.f18945b));
                String str6 = pVar.f18946c;
                if (str6 == null) {
                    jVar.g(3);
                } else {
                    jVar.n(3, str6);
                }
                String str7 = pVar.f18947d;
                if (str7 == null) {
                    jVar.g(4);
                } else {
                    jVar.n(4, str7);
                }
                byte[] c11 = a6.g.c(pVar.e);
                if (c11 == null) {
                    jVar.g(5);
                } else {
                    jVar.z(c11, 5);
                }
                byte[] c12 = a6.g.c(pVar.f18948f);
                if (c12 == null) {
                    jVar.g(6);
                } else {
                    jVar.z(c12, 6);
                }
                jVar.b(7, pVar.f18949g);
                jVar.b(8, pVar.f18950h);
                jVar.b(9, pVar.i);
                jVar.b(10, pVar.f18952k);
                int i12 = pVar.f18953l;
                if (i12 != 0) {
                    int b10 = q0.d.b(i12);
                    if (b10 != 0) {
                        if (b10 == 1) {
                            i = 1;
                        } else {
                            l4.a.o();
                            return;
                        }
                    } else {
                        i = 0;
                    }
                    jVar.b(11, i);
                    jVar.b(12, pVar.f18954m);
                    jVar.b(13, pVar.f18955n);
                    jVar.b(14, pVar.f18956o);
                    jVar.b(15, pVar.f18957p);
                    jVar.b(16, pVar.f18958q ? 1L : 0L);
                    int i13 = pVar.f18959r;
                    if (i13 != 0) {
                        int b11 = q0.d.b(i13);
                        if (b11 != 0) {
                            if (b11 == 1) {
                                i10 = 1;
                            } else {
                                l4.a.o();
                                return;
                            }
                        } else {
                            i10 = 0;
                        }
                        jVar.b(17, i10);
                        jVar.b(18, pVar.f18960s);
                        jVar.b(19, pVar.f18961t);
                        jVar.b(20, pVar.f18962u);
                        jVar.b(21, pVar.f18963v);
                        jVar.b(22, pVar.f18964w);
                        a6.d dVar2 = pVar.f18951j;
                        if (dVar2 != null) {
                            int i14 = dVar2.f258a;
                            if (i14 != 0) {
                                int b12 = q0.d.b(i14);
                                if (b12 != 0) {
                                    if (b12 != 1) {
                                        if (b12 != 2) {
                                            if (b12 != 3) {
                                                if (b12 != 4) {
                                                    if (Build.VERSION.SDK_INT >= 30 && i14 == 6) {
                                                        i11 = 5;
                                                    } else {
                                                        throw new IllegalArgumentException("Could not convert " + a5.a.x(i14) + " to int");
                                                    }
                                                } else {
                                                    i11 = 4;
                                                }
                                            } else {
                                                i11 = 3;
                                            }
                                        } else {
                                            i11 = 2;
                                        }
                                    }
                                } else {
                                    i11 = 0;
                                }
                                jVar.b(23, i11);
                                jVar.b(24, dVar2.f259b ? 1L : 0L);
                                jVar.b(25, dVar2.f260c ? 1L : 0L);
                                jVar.b(26, dVar2.f261d ? 1L : 0L);
                                jVar.b(27, dVar2.e ? 1L : 0L);
                                jVar.b(28, dVar2.f262f);
                                jVar.b(29, dVar2.f263g);
                                Set<a6.c> set = dVar2.f264h;
                                set.getClass();
                                if (set.isEmpty()) {
                                    byteArray = new byte[0];
                                } else {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    try {
                                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                        try {
                                            objectOutputStream.writeInt(set.size());
                                            for (a6.c cVar : set) {
                                                objectOutputStream.writeUTF(cVar.f256a.toString());
                                                objectOutputStream.writeBoolean(cVar.f257b);
                                            }
                                            objectOutputStream.close();
                                            byteArrayOutputStream.close();
                                            byteArray = byteArrayOutputStream.toByteArray();
                                            byteArray.getClass();
                                        } finally {
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            pa.a(byteArrayOutputStream, th);
                                            throw th2;
                                        }
                                    }
                                }
                                jVar.z(byteArray, 30);
                                return;
                            }
                            throw null;
                        }
                        jVar.g(23);
                        jVar.g(24);
                        jVar.g(25);
                        jVar.g(26);
                        jVar.g(27);
                        jVar.g(28);
                        jVar.g(29);
                        jVar.g(30);
                        return;
                    }
                    throw null;
                }
                throw null;
            default:
                r rVar = (r) obj;
                String str8 = rVar.f18977a;
                if (str8 == null) {
                    jVar.g(1);
                } else {
                    jVar.n(1, str8);
                }
                jVar.n(2, rVar.f18978b);
                return;
        }
    }

    public final void i(Object obj) {
        r5.j a10 = a();
        try {
            h(a10, obj);
            a10.f24578v.executeInsert();
        } finally {
            f(a10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(v vVar, int i) {
        super(vVar);
        this.f18912d = i;
    }
}
