package com.google.android.gms.internal.consent_sdk;
import z.b;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class f6 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f13404a;

    static {
        char[] cArr = new char[80];
        f13404a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        b(i, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            h5 h5Var = h5.f13430w;
            sb2.append(z.b(new h5(((String) obj).getBytes(u5.f13575a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof h5) {
            sb2.append(": \"");
            sb2.append(z.b((h5) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof q5) {
            sb2.append(" {");
            c((q5) obj, sb2, i + 2);
            sb2.append("\n");
            b(i, sb2);
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            int i11 = i + 2;
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb2, i11, "key", entry.getKey());
            a(sb2, i11, "value", entry.getValue());
            sb2.append("\n");
            b(i, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    public static void b(int i, StringBuilder sb2) {
        while (i > 0) {
            int i10 = 80;
            if (i <= 80) {
                i10 = i;
            }
            sb2.append(f13404a, 0, i10);
            i -= i10;
        }
    }

    public static void c(q5 q5Var, StringBuilder sb2, int i) {
        int i10;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = q5Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            i10 = 3;
            if (i11 >= length) {
                break;
            }
            Method method3 = declaredMethods[i11];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i11++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i10);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb2, i, substring.substring(0, substring.length() - 4), q5.i(method2, q5Var, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i, substring.substring(0, substring.length() - 3), q5.i(method, q5Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object i12 = q5.i(method4, q5Var, new Object[0]);
                    if (method5 == null) {
                        if (i12 instanceof Boolean) {
                            if (!((Boolean) i12).booleanValue()) {
                            }
                            a(sb2, i, substring, i12);
                        } else if (i12 instanceof Integer) {
                            if (((Integer) i12).intValue() == 0) {
                            }
                            a(sb2, i, substring, i12);
                        } else if (i12 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) i12).floatValue()) == 0) {
                            }
                            a(sb2, i, substring, i12);
                        } else if (i12 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) i12).doubleValue()) == 0) {
                            }
                            a(sb2, i, substring, i12);
                        } else {
                            if (i12 instanceof String) {
                                equals = i12.equals("");
                            } else if (i12 instanceof h5) {
                                equals = i12.equals(h5.f13430w);
                            } else if (i12 instanceof c5) {
                                if (i12 == ((q5) ((q5) ((c5) i12)).f(6))) {
                                }
                                a(sb2, i, substring, i12);
                            } else {
                                if ((i12 instanceof Enum) && ((Enum) i12).ordinal() == 0) {
                                }
                                a(sb2, i, substring, i12);
                            }
                            if (equals) {
                            }
                            a(sb2, i, substring, i12);
                        }
                    } else {
                        if (!((Boolean) q5.i(method5, q5Var, new Object[0])).booleanValue()) {
                        }
                        a(sb2, i, substring, i12);
                    }
                }
            }
            i10 = 3;
        }
    }
}
