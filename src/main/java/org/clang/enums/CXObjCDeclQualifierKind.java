/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.clang.enums;

import org.moe.natj.general.ann.Generated;

/**
 * 'Qualifiers' written next to the return and parameter types in
 * Objective-C method declarations.
 */
@Generated
public final class CXObjCDeclQualifierKind {
    @Generated public static final int CXObjCDeclQualifier_None = 0x00000000;
    @Generated public static final int CXObjCDeclQualifier_In = 0x00000001;
    @Generated public static final int CXObjCDeclQualifier_Inout = 0x00000002;
    @Generated public static final int CXObjCDeclQualifier_Out = 0x00000004;
    @Generated public static final int CXObjCDeclQualifier_Bycopy = 0x00000008;
    @Generated public static final int CXObjCDeclQualifier_Byref = 0x00000010;
    @Generated public static final int CXObjCDeclQualifier_Oneway = 0x00000020;

    @Generated
    private CXObjCDeclQualifierKind() {
    }
}
