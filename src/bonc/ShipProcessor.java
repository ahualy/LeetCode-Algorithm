package bonc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShipProcessor {
    public static void main(String[] args) {
        List<String> enName = getEnName("/Users/anbinjie/IdeaProjects/LeetCode-Algorithm/src/美国舰船重要.txt");
        for (String enname : enName) {
            if (enname.split(" ")[0].equals("CG")){
                String suffix = "\"提康德罗加\"级巡洋舰";
                if (enname.contains("Vincennes")) {
                    enname = enname.replace("Ticonderoga",suffix).replace("Vincennes","文森斯号");
                }
                if (enname.contains("Bunker Hill")) {
                    enname = enname.replace("Ticonderoga",suffix).replace("Bunker Hill","邦克山号");
                }
                if (enname.contains("Antietam")) {
                    enname = enname.replace("Ticonderoga",suffix).replace("Antietam","安提坦号");
                }
                if (enname.contains("San Jacinto")) {
                    enname = enname.replace("Ticonderoga",suffix).replace("San Jacinto","圣吉辛托古号");
                }
                if (enname.contains("Princeton")) {
                    enname = enname.replace("Ticonderoga",suffix).replace("Princeton","普林斯顿号");
                }
                if (enname.contains("Anzio")) {
                    enname = enname.replace("Ticonderoga",suffix).replace("Anzio","安齐奥号");
                }
                if (enname.contains("Lake Erie")) {
                    enname = enname.replace("Ticonderoga",suffix).replace("Lake Erie","伊利湖号");
                }
                if (enname.contains("CG 47 Ticonderoga")) {
                    enname = enname.replace("Ticonderoga",suffix);
                }
            }

            if (enname.split(" ")[0].equals("CGN")) {
                String suffix = "\"弗吉尼亚\"级核动力巡洋舰";
                enname = enname.replace("Virginia",suffix);
            }

            if (enname.split(" ")[0].equals("CV")) {
                String suffix = "\"小鹰\"级航母";
                enname = enname.replace("Kitty Hawk Class",suffix).replace("America","美国");
            }
            if (enname.split(" ")[0].equals("CVN")) {
                String suffix = "\"企业\"号核动力航母";
                enname = enname.replace("Enterprise",suffix);
            }
            if (enname.split(" ")[0].equals("CVN")) {
                String suffix = "\"尼米兹\"级核动力航母";
                String clazz = "Nimitz Class";
                if (enname.contains("Dwight D. Eisenhower")) {
                    enname = enname.replace("Dwight D. Eisenhower","艾森豪威尔号").replace(clazz,suffix);
                }
                if (enname.contains("Carl Vinso")) {
                    enname = enname.replace("Carl Vinson","卡尔·文森号").replace(clazz,suffix);
                }
                if (enname.contains("Theodore Roosevelt")) {
                    enname = enname.replace("Theodore Roosevelt","罗斯福号").replace(clazz,suffix);
                }
                if (enname.contains("Abraham Lincoln")) {
                    enname = enname.replace("Abraham Lincoln","亚伯拉罕·林肯号").replace(clazz,suffix);
                }
                if (enname.contains("George Washington")) {
                    enname = enname.replace("George Washington","乔治·华盛顿号").replace(clazz,suffix);
                }
                if (enname.contains("John C. Stennis")) {
                    enname = enname.replace("John C. Stennis","斯坦尼斯号").replace(clazz,suffix);
                }
                if (enname.contains("Harry S Truman")) {
                    enname = enname.replace("Harry S Truman","哈里·杜鲁门号").replace(clazz,suffix);
                }
                if (enname.contains("Ronald Reagan")) {
                    enname = enname.replace("Ronald Reagan","里根号").replace(clazz,suffix);
                }
                if (enname.contains("George Bush")) {
                    enname = enname.replace("George Bush","布什号").replace(clazz,suffix);
                }
                if (enname.contains("CVN 68 Nimitz")) {
                    enname = enname.replace("Nimitz",suffix);
                }
            }
            if (enname.split(" ")[0].equals("DD")) {
                String suffix = "\"斯普鲁恩斯\"级驱逐舰";
                if (enname.contains("DD 963 Spruance")) {
                    enname = enname.replace("Spruance",suffix);
                }
            }
            if (enname.split(" ")[0].equals("DDG")) {
                String suffix = "\"阿利·伯克\"级驱逐舰 ";
                if (enname.contains("DDG 51 Arleigh Burke")) {
                    enname = enname.replace("Arleigh Burke Flight",suffix);
                }
                if (enname.contains("Mahan")) {
                    enname = enname.replace("Arleigh Burke Flight",suffix).replace("Mahan","马汉号");
                }
                if (enname.contains("Oscar Austin")) {
                    enname = enname.replace("Arleigh Burke Flight",suffix).replace("Oscar Austin","奥斯卡·奥斯汀号");
                }
                if (enname.contains("Winston S. Churchil")) {
                    enname = enname.replace("Arleigh Burke Flight",suffix).replace("Winston S. Churchill","温斯顿·S·丘吉尔号");
                }
                if (enname.contains("McCampbell")) {
                    enname = enname.replace("Arleigh Burke Flight",suffix).replace("McCampbell","麦克坎贝尔号");
                }
                if (enname.contains("Pinckney")) {
                    enname = enname.replace("Arleigh Burke Flight",suffix).replace("Pinckney","平克尼号");
                }
                if (enname.contains("Bainbridge")) {
                    enname = enname.replace("Arleigh Burke Flight",suffix).replace("Bainbridge","班布里奇号");
                }
            }

            if (enname.split(" ")[0].equals("FFG")) {
                if (enname.contains("Underwood")) {
                    enname = enname.replace("Underwood","安德伍德号").replace("Perry Class","\"佩里\"级护卫舰");
                } else {
                    enname = enname.replace("Oliver Hazard Perry","\"佩里\"级护卫舰");
                }
            }
            if (enname.contains("LCAC")) {
                enname = enname.replace("LCAC","LCAC气垫登陆艇");
            }
            if (enname.contains("Tarawa")) {
                enname = enname.replace("Tarawa","\"塔拉瓦\"级通用两栖攻击舰");
            }
            if (enname.contains("Wasp")) {
                enname = enname.replace("Wasp","\"黄蜂\"级通用两栖攻击舰");
            }
            if (enname.contains("LPD 17")) {
                enname = enname.replace("San Antonio","\"圣安东尼奥\"级多用途两栖船坞运输舰");
            }
            if (enname.contains("LSD 41")) {
                enname = enname.replace("Whidbey Island","\"惠德贝岛\"级船坞登陆舰");
            }
            if (enname.contains("Harpers Ferry")) {
                enname = enname.replace("Harpers Ferry","\"哈泊斯费里\"级船坞登陆舰");
            }
            if (enname.contains("Newport")) {
                enname = enname.replace("Newport","\"新港\"级坦克登陆舰");
            }
            if (enname.contains("MCM 1")) {
                enname = enname.replace("Avenger","\"复仇者\"级猎扫雷舰");
            }
            if (enname.contains("T-AGM")) {
                enname = enname.replace("Observation Island","\"观察岛\"号航天测量船");
            }
            if (enname.contains("Supply")) {
                enname = enname.replace("Supply","\"供应\"级综合补给船");
            }
            if (enname.contains("Sacramento")) {
                enname = enname.replace("Sacramento","\"萨克拉门托\"级综合补给船");
            }
            System.out.println(enname);
        }
    }

    private static List<String> getEnName(String name) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File file = new File(name);
            InputStreamReader inputReader = new InputStreamReader(new FileInputStream(file));
            BufferedReader bf = new BufferedReader(inputReader);
            // 按行读取字符串
            String str;
            while ((str = bf.readLine()) != null) {
                arrayList.add(str);
            }
            bf.close();
            inputReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
