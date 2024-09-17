from App.interfaces import ImagePoster

class TweetManager(ImagePoster):
    def __init__(self,api_key,api_key_secret,bearer_token,access_token,access_token_secret): 
        self.__api_key = api_key
        self.__api_key_secret = api_key_secret
        self.__bearer_token = bearer_token
        self.__access_token = access_token 
        self.__access_token_secret = access_token_secret

        auth = tweepy.OAuth1UserHandler(
            consumer_key = api_key
            ,consumer_secret= api_key_secret
            ,access_token = access_token
            ,access_token_secret = access_token_secret
        )

        self._-api = tweepy.API(auth,wait_on_rate_limit=True)

        self.__client = tweepy.Cliente(
            
        )