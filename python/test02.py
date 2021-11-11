while True:
    try:
        print()
        print('1: ValueError例外を発生')
        print('2: IndexError例外を発生')
        print('3: 例外を発生させない')
        print('4: 終了')
        number = int(input('選択してください。: '))
        # 問①：if文を用いて、以下の画像のように処理されるように記述しましょう。
        ##ここに書く
        if number == 1:
            tmp = int("hoge")
        elif number == 2:
            tmp = 'str'[5] 
        elif number == 3:
            print("↓")
            print('例外を発生させませんでした')
            print("↓")
        elif number == 4:
            print("↓")
            print('終了します')
            break
    # 問②：else節を用いて、以下の画像のように処理されるように記述しましょう。
    ##ここに書く
        else:
            print(undefined_var)
    except ValueError as e:
        print("↓")
        print('Value Error')
        print(e.args)
        print("↓")
    except IndexError as e:
        print("↓")
        print('Index Error')
        print(e.args)
        print("↓")
    except Exception as e:
        print("↓")
        print('Exception')
        print(e.args)
        print("↓")
    print('もう一度選択しましょう')



print('↓')
print('無限ループを終了します')