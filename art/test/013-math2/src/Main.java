/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * test add by a 16-bit constant
 */
public class Main {
    public static void math_013() {
        int a, b, res;

        a = 3;
        b = 7;

        // a 16-bit constant
        a += 32000;
        b -= 32000;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
    public static void main(String args[]) {
        math_013();
    }
}
