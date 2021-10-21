# int型のリストdataを作成し、値を1,3,5,7で初期化
    #ここに記述
data = [1, 3, 5, 7]

for i in range(len(data)):
    print(data[i]**2)

#問1-2.range()を使って問1-1と同じ結果が表示されるようなfor文を完成させて下さい。
for j in range(len(data)):
    print(data[j]**2)


#問2-1.下の画像のような出力になるように、コードを完成させてください。
all_place = ["札幌","東京","横浜","大阪","名古屋","福岡"]
wait_place = ["札幌","大阪"]
get_place = ["横浜"]

for place in all_place:
    #ここから記述（ヒント：in演算子を用いて、条件分岐）
    if place in get_place:
        print(place + "のチケットが当選しました！")
    elif place in wait_place:
    #ここから記述（ヒント：in演算子を用いて、条件分岐
        print(place + "のチケットは結果待ち")
    else:
        print(place + "のチケットは落選しました")

#問2
get_place += wait_place
place = "と".join(get_place)
print(place + "のチケットが当選しました！")